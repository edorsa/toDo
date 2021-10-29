package com.example.toDo.business.abstracts;

import com.example.toDo.core.utilities.results.DataResult;
import com.example.toDo.core.utilities.results.Result;
import com.example.toDo.entities.concretes.Item;
import com.example.toDo.entities.concretes.User;

import java.util.List;

public interface UserService {

     DataResult<List<User>> getAll();

     Result add(User user);

     DataResult<User> getByEmail(String email);
     DataResult<User> getByNickname(String nickname);

     DataResult<List<User>> getByNicknameStartingWith(String nickname);

}
