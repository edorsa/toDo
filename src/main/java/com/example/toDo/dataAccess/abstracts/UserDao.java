package com.example.toDo.dataAccess.abstracts;

import com.example.toDo.entities.concretes.Item;
import com.example.toDo.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {

    User getByEmail(String email);
    User getByNickname(String nickname);

    List<User> getByNicknameStartingWith(String nickname);


}
