package com.example.user_service.controller;

import com.example.user_service.VO.ResponseTemplateVO;
import com.example.user_service.entity.Userssz;
import com.example.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class Usercontroller {
    @Autowired
    private UserService userService;


@PostMapping
    public Userssz saveuser(@RequestBody Userssz user){
       return userService.saveuser(user);

    }
    @GetMapping("{userid}")
public ResponseTemplateVO getuserwithedepartemnt(@PathVariable ("userid")  Long userid){
    return  userService.getUserwitheDepartemtn(userid);
}
}
