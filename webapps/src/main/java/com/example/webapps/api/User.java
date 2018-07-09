package com.example.webapps.api;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * Created by admin on 2018/7/9.
 */
@Data
@AllArgsConstructor
@ToString
public class User {
    @ID
    private Integer id;
    private String name;
    private Integer age;

}
