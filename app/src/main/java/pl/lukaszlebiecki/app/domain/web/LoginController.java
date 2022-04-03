package pl.lukaszlebiecki.app.domain.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
class LoginController {

    @GetMapping("/login")
    String loginForm() {
        return "login-form";
    }

}
