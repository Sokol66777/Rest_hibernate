package com.pvt.dao;


import com.pvt.model.User;


import java.util.List;

public interface UserDAO extends DAO<User> {

    User getUserByIdWithPost(long id);

}
