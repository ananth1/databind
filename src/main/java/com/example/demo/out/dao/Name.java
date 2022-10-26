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
public class Name {
	@JsonAlias("firstName")
	private String fName;
	@JsonAlias("lastName")
	private String lName;

}
