package com.example.toDo.api.controllers;


import com.example.toDo.business.abstracts.ItemService;
import com.example.toDo.business.abstracts.UserService;
import com.example.toDo.core.utilities.results.DataResult;
import com.example.toDo.core.utilities.results.Result;
import com.example.toDo.entities.concretes.Item;
import com.example.toDo.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@CrossOrigin
public class ItemsController {

    private ItemService itemService;

    @Autowired
    public ItemsController(ItemService itemService) {
        super();
        this.itemService= itemService;
    }


    @GetMapping("/getall")
    public DataResult<List<Item>> getAll(){
        return this.itemService.getAll();

    }
    @PostMapping("/add")
    public Result add(@RequestBody Item item){

        return  this.itemService.add(item);
    }

}
