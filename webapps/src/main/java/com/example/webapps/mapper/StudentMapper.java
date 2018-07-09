package com.example.webapps.mapper;

import com.example.webapps.api.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by admin on 2018/6/29.
 */
public interface StudentMapper {

    @Select("SELECT * FROM users")
    List<Student> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    Student getOne(Long id);

    @Insert("INSERT INTO student(s_birth,s_name,s_sex) VALUES(#{s_birth}, #{s_name}, #{s_sex})")
    void insert(Student user);

    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(Student user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);

}
