package com.pvt.dao.daoImpl;

import com.pvt.dao.BaseDAO;
import com.pvt.dao.UserDAO;
import jakarta.persistence.TypedQuery;
import com.pvt.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl extends BaseDAO<User> implements UserDAO {

    public UserDAOImpl(){
        super();
        clazz = User.class;
    }


    @Override
    public User getUserByIdWithPost(long id) {
        User user;
        TypedQuery<User> namedQuery = entityManager.createNamedQuery("User.getUserByIDWithPost",clazz).
                setParameter("id",id);
        user = namedQuery.getSingleResult();
        return user;
    }
}
