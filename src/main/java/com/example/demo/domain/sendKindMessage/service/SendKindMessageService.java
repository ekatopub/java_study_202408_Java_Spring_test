package com.example.demo.domain.sendKindMessage.service;

import java.util.List;

import com.example.demo.domain.sendKindMessage.model.SendKindMessage;

public interface SendKindMessageService {

/** IDを指定しての表示内容の取得 */
public List<SendKindMessage> findDisplayTextById(int id);
}