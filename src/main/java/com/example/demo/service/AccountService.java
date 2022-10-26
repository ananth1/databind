package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dao.Account;
import com.example.demo.dao.Name;

@Service
public class AccountService {
	public Account retrieveAccount(long accountNumber) {
		if(accountNumber == 1) {
			Name name = new Name("John","Doe");
			Account account = new Account(1,"Checking",name);
			return account;
		}
		return null;
	}
}
