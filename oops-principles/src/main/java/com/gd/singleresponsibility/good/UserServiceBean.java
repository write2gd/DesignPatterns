package com.gd.singleresponsibility.good;

public class UserServiceBean implements UserService {

    private EmailService emailService;

    public void registerUser(User user) {
        Email mail = new Email("Subject", "Body", user.getEmail());
        emailService = new EmailServiceBean();
        emailService.sendEmail(mail);
    }
}
