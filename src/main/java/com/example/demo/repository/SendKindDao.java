package com.example.demo.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.domain.sendKind.model.SendKind;

public interface SendKindDao extends JpaRepository<SendKind,String> {

/* JPQL定数 */
final String JPQL_FIND_BY_KIND_ID = " SELECT s "
        + " FROM SendKind s "
        + " WHERE s.kindId = :kindId ";

/** 種別IDでの検索 */
@Query(JPQL_FIND_BY_KIND_ID)
public SendKind findByKindId(String kindId) throws DataAccessException;


}
