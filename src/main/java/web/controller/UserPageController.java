package web.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserPageController {
    @GetMapping
    public String getUserPersonalPage(Model model, Authentication authentication) {
        String username = ((UserDetails) authentication.getPrincipal()).getUsername();
        model.addAttribute("username", username);
        return "userpage";
    }
}
