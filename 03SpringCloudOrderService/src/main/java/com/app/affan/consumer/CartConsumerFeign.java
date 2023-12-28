 package com.app.affan.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.affan.entity.Cart;

@FeignClient("CART-SERVICE")
public interface CartConsumerFeign {

	@GetMapping("/cart/info")
	public ResponseEntity<String> showMessage();
	
	@GetMapping("/cart/find/{id}")
	public ResponseEntity<Cart> getCartById(@PathVariable("id")Integer id);
	
	@PostMapping("/cart/create")
	public ResponseEntity<String> addTocart(@RequestBody Cart cart);
}
