package com.example.demo.model;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class MyModel {
	//BeanValidation
    // Nullや空文字の場合にエラー
    @NotBlank(groups = ValidGroup1.class)
    // 文字数が範囲外ならエラー
    @Length(min = 1, max = 20, groups = ValidGroup2.class)
    
    // ここから基本形 
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}