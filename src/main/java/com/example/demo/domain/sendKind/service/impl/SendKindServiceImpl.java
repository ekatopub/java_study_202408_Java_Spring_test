package com.example.demo.domain.sendKind.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.sendKind.model.SendKind;
import com.example.demo.domain.sendKind.service.SendKindService;
import com.example.demo.repository.SendKindDao;

@Service
public class SendKindServiceImpl implements SendKindService {

@Autowired
private SendKindDao dao;

/** 種別IDでの検索 */
@Override
public SendKind findByKindId(String kindId) {
    return dao.findByKindId(kindId);
}


}
