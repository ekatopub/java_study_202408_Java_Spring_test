package com.example.demo.domain.sendKind.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="send_kind")

@Data
public class SendKind {


// 種別ID
@Id // 主キーに対して付与
private String kindId;

// 種別名
private String kindName;

}

