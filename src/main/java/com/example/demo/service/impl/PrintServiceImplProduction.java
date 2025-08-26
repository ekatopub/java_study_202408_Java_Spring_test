package com.example.demo.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.service.PrintService;

@Service
@Primary
public class PrintServiceImplProduction implements PrintService {

	@Override
	public void print(String text) {
		System.out.println("Production:" + text);

	}

}
