package net.geekzy.boot.auth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

/**
 * @author Imam Kurniawan (geekzy@gmail.com)
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "forward:/index.html";
    }

    @RequestMapping("/user")
    @ResponseBody
    public Principal authtenticatedUser(Principal principal) {
        return principal;
    }
}
