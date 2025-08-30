package com.example.demo.domain.message.model;

import java.io.Serializable;

import lombok.Data;

@Data
// 複合キーはSerializable必須 (ないとコンパイルエラー)
public class MessageKey implements Serializable {

  // ID
  private int id;
}