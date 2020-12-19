package com.springboot.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("dog")
public class Dog implements Animal {

	@Override
	public String characteristics() {
		// TODO Auto-generated method stub
		return "Bark";
	}
}
