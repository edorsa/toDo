package com.example.toDo.business.concretes;

import com.example.toDo.business.abstracts.ItemService;
import com.example.toDo.core.utilities.results.DataResult;
import com.example.toDo.core.utilities.results.Result;
import com.example.toDo.core.utilities.results.SuccessDataResult;
import com.example.toDo.core.utilities.results.SuccessResult;
import com.example.toDo.dataAccess.abstracts.ItemDao;
import com.example.toDo.dataAccess.abstracts.UserDao;
import com.example.toDo.entities.concretes.Item;
import com.example.toDo.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemManager implements ItemService {

    private ItemDao itemDao;
    @Autowired
    public ItemManager(ItemDao itemDao) {
        super();
        this.itemDao = itemDao;
    }

    @Override
    public DataResult<List<Item>> getAll() {
        return new SuccessDataResult<List<Item>>(this.itemDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(Item item) {
        this.itemDao.save(item);
        return new SuccessResult("To Do Eklendi");
    }



}
