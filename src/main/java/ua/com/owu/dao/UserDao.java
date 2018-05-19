package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.entity.User;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    List<User> findAllByEmail(String email);
}
