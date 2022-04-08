package pl.lukaszlebiecki.app.domain.web;

import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.lukaszlebiecki.app.domain.user.UserService;
import pl.lukaszlebiecki.app.domain.user.dto.UserInfoDto;

import java.util.Optional;

@Controller
class HomeController {

    private final UserService userService;

    HomeController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    String home(@CurrentSecurityContext SecurityContext securityContext, Model model) {
        Optional<UserInfoDto> findUser = userService.findUserByUserName(securityContext.getAuthentication().getName());
        if (findUser.isPresent()) {
            UserInfoDto userInfoDto = findUser.get();
            String name = userInfoDto.getName();
            String level = userInfoDto.getLevel();
            String progress = userInfoDto.getProgress();
            model.addAttribute("name", name);
            model.addAttribute("level", level);
            model.addAttribute("progress", progress);
        }
        return "index";
    }
}
