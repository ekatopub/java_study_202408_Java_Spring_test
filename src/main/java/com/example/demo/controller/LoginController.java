package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.dto.HistoryDto;
import com.example.demo.model.LoginModel;

@Controller
public class LoginController {

    /** ログイン画面を表示 */
    @GetMapping("/login") // RequestMappingアノテーション無しで単独でパス指定可能
    public String getLogin(Model model, @ModelAttribute LoginModel loginModel) {
    	
    	// 画面に表示する履歴の作成
    	List<HistoryDto> historyDtoList = new ArrayList<HistoryDto>();
    	HistoryDto historyDto = new HistoryDto();
    	historyDto.setDateStr("2023/07/01");
    	historyDto.setHistoryText("新規作成");
    	historyDtoList.add(historyDto);
    	historyDto = new HistoryDto();
    	historyDto.setDateStr("2023/08/01");
    	historyDto.setHistoryText("「すぐに表示」ボタン作成");
    	historyDtoList.add(historyDto);
    	historyDto = new HistoryDto();
    	historyDto.setDateStr("2023/09/01");
    	historyDto.setHistoryText("ログインボタン作成");
    	historyDtoList.add(historyDto);
    	model.addAttribute("historyDtoList", historyDtoList);
    	
    	
        return "login";
    }
}