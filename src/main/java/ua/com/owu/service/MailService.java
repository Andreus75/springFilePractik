package ua.com.owu.service;

import ua.com.owu.entity.User;

public interface MailService {
    void sendEmail(User user);
}
