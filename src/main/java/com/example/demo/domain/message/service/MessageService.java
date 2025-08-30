package com.example.demo.domain.message.service;

import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.message.model.Message;

public interface MessageService {

  /** 1件登録 */
  public void postText(Message message);
  
  /** 削除(全件) */
  @Transactional // メソッドを抜ける時にcommit発行
//  public int deleteAll(); //独自メソッドの場合
  public long deleteAll(); //標準メソッドの場合
}
