package com.example.webapps.api.interfaceExample;

import com.example.webapps.api.User;

/**
 * Created by admin on 2018/7/9.
 */
public interface UserRepository extends MongoRepository<User, String>{

    User findByName(String name);

}
