package com.firuz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firuz.demo.entity.Tourist;

@Repository
public interface TouristRepoi extends JpaRepository<Tourist, Integer> {

}
