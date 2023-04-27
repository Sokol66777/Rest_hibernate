package com.pvt.dao;

import com.pvt.model.User;

public interface UserDAO extends DAO<User> {

    User getUserByIdWithPost(long id);

}
