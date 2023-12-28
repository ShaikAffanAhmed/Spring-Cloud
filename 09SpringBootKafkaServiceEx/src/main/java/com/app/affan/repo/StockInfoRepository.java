package com.app.affan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.affan.entity.StockInfo;

public interface StockInfoRepository extends JpaRepository<StockInfo, Integer> {

}
