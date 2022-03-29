package pl.lukaszlebiecki.app.domain.user;

import org.springframework.stereotype.Service;
import pl.lukaszlebiecki.app.domain.user.dto.UserCredentialsDto;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserCredentialsDto> findCredentialsByEmail(String email) {
        return userRepository.findByEmail(email)
                .map(UserCredentialsDtoMapper::map);
    }
}
