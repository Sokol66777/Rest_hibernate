package com.web.controllers.user;

import com.pvt.dao.UserDAO;
import com.pvt.model.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/")
public class LoginController {

    @Autowired
    UserDAO userFasad;

    @GetMapping(value = "/getUser")
    public ResponseEntity<User> getUser(@RequestParam Long id){
        User user = userFasad.get(id);

        return new ResponseEntity<>(user,OK);
    }

    @GetMapping(value = "/getUserWithPost")
    public ResponseEntity<User> getUserWithPost(@RequestParam Long id){
        User user = userFasad.getUserByIdWithPost(id);


        return new ResponseEntity<>(user,OK);
    }
}
