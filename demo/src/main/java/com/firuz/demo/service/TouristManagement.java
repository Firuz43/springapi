package com.firuz.demo.service;

import java.util.List;

import com.firuz.demo.entity.Tourist;

public interface TouristManagement {

    public String registerTourist(Tourist tourist);

    public Tourist fetchTouristById(Integer id);

    public List<Tourist> fetchAllTourist();

    public String updateTouristData(Tourist tourist);

    public String updateTouristDataById(Integer id, Double budget);

    public String deleteTourist(Integer id);

}
