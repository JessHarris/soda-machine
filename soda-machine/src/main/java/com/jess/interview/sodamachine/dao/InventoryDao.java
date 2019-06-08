package com.jess.interview.sodamachine.dao;

import com.jess.interview.sodamachine.entity.Soda;

import java.util.List;

public interface InventoryDao {

    List<Soda> findAll();

    Soda findById(int id);

    void save(Soda soda);
}
