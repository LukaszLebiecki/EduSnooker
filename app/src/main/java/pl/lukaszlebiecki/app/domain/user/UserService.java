package pl.lukaszlebiecki.app.domain.user;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.lukaszlebiecki.app.domain.user.dto.UserCredentialsDto;
import pl.lukaszlebiecki.app.domain.user.dto.UserInfoDto;
import pl.lukaszlebiecki.app.domain.user.dto.UserRegistrationDto;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserService {

    private static final String USER_ROLE = "USER";
    private static final String ADMIN_AUTHORITY = "ROLE_ADMIN";

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserLevelRepository userLevelRepository;

    public UserService(UserRepository userRepository, UserRoleRepository userRoleRepository, PasswordEncoder passwordEncoder,UserLevelRepository userLevelRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.passwordEncoder = passwordEncoder;
        this.userLevelRepository = userLevelRepository;
    }

    public Optional<UserCredentialsDto> findCredentialsByEmail(String email) {
        return userRepository.findByEmail(email)
                .map(UserCredentialsDtoMapper::map);
    }

    public Optional<UserInfoDto> findUserByUserName(String userName) {
        return userRepository.findByEmail(userName)
                .map(UserInfoDtoMapper::map);
    }

    @Transactional
    public void register(UserRegistrationDto registrationDto) {
        User user = new User();
        user.setName(registrationDto.getName());
        user.setEmail(registrationDto.getEmail());
        UserLevel userLevel = userLevelRepository.save(new UserLevel());
        userLevel.setLevel("l0.png");
        userLevel.setProgress("00.png");
        user.setUserLevel(userLevel);
        String passwordHash = passwordEncoder.encode(registrationDto.getPassword());
        user.setPassword(passwordHash);
        Optional<UserRole> userRole = userRoleRepository.findByName(USER_ROLE);
        userRole.ifPresentOrElse(
                role -> user.getRoles().add(role),
                () -> {
                    throw new NoSuchElementException();
                }
        );
        userRepository.save(user);
    }


}
