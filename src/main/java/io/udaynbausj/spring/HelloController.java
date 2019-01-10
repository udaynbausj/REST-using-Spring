package io.udaynbausj.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public List<userinfo> welcome(){
        return userService.getUserInfo();
    }
}
