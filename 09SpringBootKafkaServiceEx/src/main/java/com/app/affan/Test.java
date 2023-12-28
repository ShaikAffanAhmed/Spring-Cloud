package com.app.affan;

import com.app.affan.entity.StockInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	//JSON to Object
	public static void main(String[] args) {
		String json = "{\"stkId\":101,\"stkCode\":\"A\",\"skCost\":200.0}";
		
		try {
			ObjectMapper om = new ObjectMapper();
			StockInfo si = om.readValue(json, StockInfo.class);
			System.out.println(si);
		} catch (Exception e) {
			
		}
	}
	
	
	//Object to JSON
	public static void main1(String[] args) {
		StockInfo si = new StockInfo();
		si.setStkCode("A");
		si.setStkCost(200.0);
		si.setStkId(101);
		
		try {
			ObjectMapper om = new ObjectMapper();
			String s = om.writeValueAsString(si);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
