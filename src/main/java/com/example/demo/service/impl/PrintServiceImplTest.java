package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.PrintService;

@Service
public class PrintServiceImplTest implements PrintService {

	@Override
	public void print(String text) {
		System.out.println("Test" + text);

	}

}
