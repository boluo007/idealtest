package com.hdk.dao;



import com.hdk.pojo.Items;

import java.util.List;

public interface UserDao {

    List<Items> findAll();

    void save(Items items);
}
