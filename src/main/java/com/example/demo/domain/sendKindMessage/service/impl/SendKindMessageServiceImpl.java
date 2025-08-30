package com.example.demo.domain.sendKindMessage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.sendKindMessage.model.SendKindMessage;
import com.example.demo.domain.sendKindMessage.service.SendKindMessageService;
import com.example.demo.repository.SendKindDao;

@Service
public class SendKindMessageServiceImpl implements SendKindMessageService {

@Autowired
private SendKindDao dao;

/** IDを指定しての表示内容の取得 */
@Override
public List<SendKindMessage> findDisplayTextById(int id) {
    return dao.findDisplayTextById(id);
}


}