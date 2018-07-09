package com.example.webapps

import com.example.webapps.api.Student
import com.example.webapps.mapper.StudentMapper
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired

/**
 * Created by admin on 2018/6/29.
 */
public class StudentMapperTestTest extends groovy.util.GroovyTestCase {
    @Autowired
    private StudentMapper UserMapper;

    @Test
    public void testInsert() throws Exception {
        UserMapper.insert(new Student("aa", "a123456", "qwe"));
        UserMapper.insert(new Student("bb", "b123456", "qwe"));
        UserMapper.insert(new Student("cc", "b123456", "qwe"));

//        Assert.assertEquals(3, UserMapper.getAll().size());
    }
}
