package com.app.affan.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.affan.entity.StockInfo;
import com.app.affan.repo.StockInfoRepository;
import com.app.affan.util.JsonUtil;

@Component
public class MessageStore {

	@Autowired
	private StockInfoRepository repo;
	
	public void add(String message) {
		//JSON To Object 
	   StockInfo si = JsonUtil.convertToObj(message);
	   repo.save(si);
	}

	public List<StockInfo> getAll() {
		return repo.findAll();
	}

} 	
