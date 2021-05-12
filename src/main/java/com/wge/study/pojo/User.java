package com.wge.study.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
    private String name;
    private String age;
    private List<String> hobbys;
    private Map<String, Object> identity;
    private Set<String> games;
    private Properties properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, Object> getIdentity() {
        return identity;
    }

    public void setIdentity(Map<String, Object> identity) {
        this.identity = identity;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", hobbys=" + hobbys +
                ", identity=" + identity +
                ", games=" + games +
                ", properties=" + properties +
                '}';
    }
}
