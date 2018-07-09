package com.example.webapps;

import com.example.webapps.api.Student;
import com.example.webapps.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by admin on 2018/6/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    private StudentMapper UserMapper;

    @Test
    public void testInsert(){
        UserMapper.insert(new Student("zhouyang", "a123456", "qwe"));
        UserMapper.insert(new Student("yangxue", "b123456", "qwe"));
        UserMapper.insert(new Student("xuexue", "b123456", "qwe"));

//        Assert.assertEquals(3, UserMapper.getAll().size());
    }

    @Test
    public void testQuery(){
        List<Student> users = UserMapper.getAll();
        System.out.println(users.toString());
    }

//    @Test
//    public void testUpdate() throws Exception {
//        Student user = UserMapper.getOne(3l);
//        System.out.println(user.toString());
//        user.setS_name("neo");
//        UserMapper.update(user);
//        Assert.assertTrue(("neo".equals(UserMapper.getOne(3l).getNickName())));
//    }
}
