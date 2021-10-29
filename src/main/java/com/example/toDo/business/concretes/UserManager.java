package com.example.toDo.business.concretes;

import com.example.toDo.business.abstracts.UserService;
import com.example.toDo.core.utilities.results.DataResult;
import com.example.toDo.core.utilities.results.Result;
import com.example.toDo.core.utilities.results.SuccessDataResult;
import com.example.toDo.core.utilities.results.SuccessResult;
import com.example.toDo.dataAccess.abstracts.UserDao;
import com.example.toDo.entities.concretes.Item;
import com.example.toDo.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;
    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getAll() {

        return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data Listelendi");

    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı Eklendi");
    }

    @Override
    public DataResult<User> getByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.getByEmail(email),"Data Listelendi");
    }

    @Override
    public DataResult<User> getByNickname(String nickname) {
        return new SuccessDataResult<User>(this.userDao.getByNickname(nickname),"Data Listelendi");
    }

    @Override
    public DataResult<List<User>> getByNicknameStartingWith(String nickname) {
        return new SuccessDataResult<List<User>>(this.userDao.getByNicknameStartingWith(nickname),"Data Listelendi");
    }




}
