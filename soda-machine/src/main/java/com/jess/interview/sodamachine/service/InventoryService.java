package com.jess.interview.sodamachine.service;

import com.jess.interview.sodamachine.entity.Soda;

import java.util.List;

public interface InventoryService {
    List<Soda> findAll();

    Soda findById(int id);

    void save(Soda soda);

    int totalCount();
}
