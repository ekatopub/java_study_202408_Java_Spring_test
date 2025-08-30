package com.example.demo.domain.sendKind.service;

import com.example.demo.domain.sendKind.model.SendKind;

public interface SendKindService {


/** 種別IDでの検索 */
public SendKind findByKindId(String kindId);


}
