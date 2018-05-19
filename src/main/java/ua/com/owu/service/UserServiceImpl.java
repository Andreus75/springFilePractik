package ua.com.owu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.UserDao;
import ua.com.owu.entity.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    public void save(User user) {
        if (user != null)userDao.save(user);

    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}
