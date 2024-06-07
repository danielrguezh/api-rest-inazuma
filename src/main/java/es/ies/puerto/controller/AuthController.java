package es.ies.puerto.controller;

import es.ies.puerto.dto.UserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @PostMapping("/login")
    public String createAuthenticationToken(@RequestBody UserInfo userInfo) {
        return "soyElToken";
    }


    @PostMapping("/login2")
    public String createAuthenticationToken() {
        return "soyElToken";
    }
}
