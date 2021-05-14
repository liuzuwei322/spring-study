package com.wge.study.tx;

import org.springframework.jdbc.core.JdbcTemplate;

public class MyTx {
    public void delete(JdbcTemplate jdbcTemplate) {
        String insertSql = "insert into tbl_user values(12, 'test', 24)";
        jdbcTemplate.execute(insertSql);

        String deleteSql = "delete from tbl_user where user_id = ?";
        jdbcTemplate.update(deleteSql, 11);
    }
}
