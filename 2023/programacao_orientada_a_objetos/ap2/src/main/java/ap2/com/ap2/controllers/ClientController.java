package ap2.com.ap2.controllers;

import ap2.com.ap2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController( UserService userService){
        this.userService = userService;
    }
    @GetMapping("/hello")
    public String getAll(){
        return this.userService.getAll();
    }

}
