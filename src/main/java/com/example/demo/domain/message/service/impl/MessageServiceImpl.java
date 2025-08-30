package com.example.demo.domain.message.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.message.model.Message;
import com.example.demo.domain.message.service.MessageService;
import com.example.demo.repository.MessageDao;

@Service
public class MessageServiceImpl implements MessageService {

  @Autowired
  private MessageDao dao;

  /** 1件登録 */
  @Override
  public void postText(Message message) {
    dao.save(message); // JPA標準のsaveメソッド。主キーが存在なければINSERT、あればUPDATE発行。  
  }
  /** 全件削除 */
  @Override
  public int deleteAll() {
    return dao.deleteByKindId("0001");
  }
}