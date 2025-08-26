package com.example.demo.model;

import javax.validation.GroupSequence;

// バリデーションチェックの順番を定義
@GroupSequence({ ValidGroup1.class, ValidGroup2.class })
public interface GroupOrder {
}
