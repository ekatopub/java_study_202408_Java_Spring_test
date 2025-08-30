package com.example.demo.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.domain.sendKind.model.SendKind;
import com.example.demo.domain.sendKindMessage.model.SendKindMessage;

public interface SendKindDao extends JpaRepository<SendKind,String> {

/* JPQL定数 */
final String JPQL_FIND_BY_KIND_ID = " SELECT s "
        + " FROM SendKind s "
        + " WHERE s.kindId = :kindId ";

/* SQL定数 */
final String SQL_FIND_DISPLAY_TEXT_BY_ID = "SELECT sk.kind_name, "
+ "m.text "
+ "FROM send_kind sk "
+ "JOIN message m "
+ "ON sk.kind_id = m.kind_id "
+ "WHERE m.id = :id ";

/** 種別IDでの検索 */
@Query(JPQL_FIND_BY_KIND_ID)
public SendKind findByKindId(String kindId) throws DataAccessException;

/* IDを指定しての表示内容の取得 */
@Query(value=SQL_FIND_DISPLAY_TEXT_BY_ID, nativeQuery = true)
public List<Object[]> findDisplayTextByIdRaw(int id) throws DataAccessException;

/* 表示内容取得型変換 */
public default List<SendKindMessage> findDisplayTextById(int id) {
	return findDisplayTextByIdRaw(id)
		.stream() // 取得結果をストリーム (入出力を簡易化した形式）に変換
		.map(SendKindMessage::new) // ストリームをMUuserBoard型に変換
		.collect(Collectors.toList()); // List型に成形
}

}
