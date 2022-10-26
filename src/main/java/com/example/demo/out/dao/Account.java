package com.example.demo.out.dao;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	@JsonAlias("accountNumber")
	private long accNumber;
	@JsonAlias("type")
	private String accType;
	@JsonAlias("name")
	private Name accName;
}
