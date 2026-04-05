package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Cloth;

public interface AmzonRepo extends JpaRepository<Cloth, Integer>{

}
