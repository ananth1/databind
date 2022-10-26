package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Account;
import com.example.demo.service.AccountService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class RestExample {
	
	ObjectMapper mapper = new ObjectMapper();
	
	@Autowired
	AccountService service;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
	
	@GetMapping("/account")
	public com.example.demo.out.dao.Account  getAccount() {
		Account account = service.retrieveAccount(1);
		return mapAccount(account);
	}
	
	@GetMapping("/oldaccount")
	public Account  getOldAccount() {
		return service.retrieveAccount(1);
	}
	
	private com.example.demo.out.dao.Account  mapAccount(Account account) {
		//mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		com.example.demo.out.dao.Account accountObj = mapper.convertValue(account,com.example.demo.out.dao.Account.class);
		return accountObj;
	}

}
