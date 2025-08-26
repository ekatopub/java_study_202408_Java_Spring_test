package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.model.LoginModel;

@Controller
public class LoginController {

    /** ログイン画面を表示 */
    @GetMapping("/login") // RequestMappingアノテーション無しで単独でパス指定可能
    public String getLogin(@ModelAttribute LoginModel loginModel) {
        return "login";
    }
}