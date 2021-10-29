package com.example.toDo.api.controllers;

import com.example.toDo.business.abstracts.UserService;
import com.example.toDo.core.utilities.results.DataResult;
import com.example.toDo.core.utilities.results.Result;
import com.example.toDo.core.utilities.results.SuccessDataResult;
import com.example.toDo.entities.concretes.Item;
import com.example.toDo.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UsersController {

    private UserService userService;
    @Autowired
    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }


    @GetMapping("/getall")
    public DataResult<List<User>> getAll(){
        return this.userService.getAll();

    }
    @PostMapping("/add")
    public Result add(@RequestBody User user){

        return  this.userService.add(user);
    }
    @GetMapping("/getByNickName")
    public DataResult<User> getByNickName(@RequestParam String nickname){
        return this.userService.getByNickname(nickname);
    }
    @GetMapping("/getByEmail")
    public DataResult<User> getByEmail(@RequestParam String email){
        return this.userService.getByEmail(email);
    }
    @GetMapping("/getByStartNickName")
    public DataResult<List<User>> getByNicknameStartingWith(@RequestParam String nickname){
        return this.userService.getByNicknameStartingWith(nickname);
    }


}
