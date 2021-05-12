package com.wge.study;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wge.study.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");

        String sql = "select * from user where uid = ?";

        String list = "select * from user";

        List<Person> res = jdbcTemplate.query(list, (resultSet, i) -> {
            Person person = new Person();
            person.setName(resultSet.getString("name"));
            person.setAge(resultSet.getInt("age"));
            person.setId(resultSet.getInt("uid"));
            person.setPassword(resultSet.getString("pwd"));
            return person;
        });
        System.out.println(res);

        List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(list);

        JSON json = (JSON) JSON.toJSON(queryForList.get(0));

        Person person = JSONObject.toJavaObject(json, Person.class);

        System.out.println(person);
    }
}
