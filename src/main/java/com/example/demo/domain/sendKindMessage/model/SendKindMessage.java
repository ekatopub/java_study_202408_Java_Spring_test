package com.example.demo.domain.sendKindMessage.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // getterやsetterの作成
@AllArgsConstructor // 値セット用の引数付きのコンストラクタ作成
public class SendKindMessage {

public SendKindMessage(Object[] objects) {
this(
(String) objects[0],
(String) objects[1]
);
}

// 送信種別テーブル.種別名
private String kindName;

// メッセージテーブル.投稿内容
private String text;

}