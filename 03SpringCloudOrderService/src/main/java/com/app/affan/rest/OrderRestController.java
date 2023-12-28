package com.app.affan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.affan.consumer.CartConsumerFeign;
import com.app.affan.entity.Cart;

@RestController
@RequestMapping("/order")
public class OrderRestController {

	@Autowired
	private CartConsumerFeign consumer;
	
	@GetMapping("/place")
	public ResponseEntity<String> placeOrder()
	{
		String CartResp = consumer.showMessage().getBody();
		return ResponseEntity.ok("ORDER PLACED WITH => " + CartResp);
	}
    
	@GetMapping("/fetch/{id}")
	public ResponseEntity<String> fetchOrderWithService(
			@PathVariable("id") Integer id)
	{
		Cart cob = consumer.getCartById(id).getBody();
		return ResponseEntity.ok("ORDER WITH CART DATA => " + cob);
	}

	@PostMapping("/addToCart")
	public ResponseEntity<String> addToCart(
		 	@RequestBody Cart cart)
	{
		String CartResp = consumer.addTocart(cart).getBody();
		return ResponseEntity.ok("ORDER WITH => " + CartResp);
	}
}
