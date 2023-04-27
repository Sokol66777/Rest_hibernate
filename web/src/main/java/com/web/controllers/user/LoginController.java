package com.web.controllers.user;

import com.pvt.dao.UserDAO;
import com.pvt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/")
public class LoginController {

    @Autowired
    UserDAO userDAO;

    @GetMapping(value = "/getUser")
    public ResponseEntity<User> getUser(@RequestParam Long id){
        User user = userDAO.get(id);
        return new ResponseEntity<>(user,OK);
    }

    @GetMapping(value = "/getUserWithPost")
    public ResponseEntity<User> getUserWithPost(@RequestParam Long id){
        User user = userDAO.getUserByIdWithPost(id);
        return new ResponseEntity<>(user,OK);
    }
}
