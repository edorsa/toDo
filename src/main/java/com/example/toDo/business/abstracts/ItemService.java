package com.example.toDo.business.abstracts;

import com.example.toDo.core.utilities.results.DataResult;
import com.example.toDo.core.utilities.results.Result;
import com.example.toDo.entities.concretes.Item;
import com.example.toDo.entities.concretes.User;

import java.util.List;

public interface ItemService {

    DataResult<List<Item>> getAll();

    Result add(Item item);

}
