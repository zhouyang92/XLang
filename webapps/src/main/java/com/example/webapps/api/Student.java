package com.example.webapps.api;

/**
 * Created by admin on 2018/6/29.
 */
public class Student {
    private String  s_id;
    private String  s_name;
    private String s_birth;
    private String s_sex;

    public Student(String s_birth, String s_name, String s_sex) {
        this.s_sex = s_sex;
        this.s_name = s_name;
        this.s_birth = s_birth;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_birth() {
        return s_birth;
    }

    public void setS_birth(String s_birth) {
        this.s_birth = s_birth;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }
}
