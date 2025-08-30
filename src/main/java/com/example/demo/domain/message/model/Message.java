package com.example.demo.domain.message.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="message")
@Data
public class Message {

  // ID
  @Id // 主キーに対して付与
  private int id;

  // 投稿内容
  private String text;

  // 種別ID
  private String kindId;
}