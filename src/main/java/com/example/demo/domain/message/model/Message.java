package com.example.demo.domain.message.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="message")


//主キーの組み合わせを外部クラスで指定（複合キーなら必須）
@IdClass(value=MessageKey.class)

/*
@Data
public class Message {
*/
@Data
//複合キーはSerializable必須（ないとコンパイルエラー）
public class Message implements Serializable {


  // ID
  @Id // 主キーに対して付与
  private int id;

  // 投稿内容
  private String text;

  // 種別ID
  private String kindId;
}