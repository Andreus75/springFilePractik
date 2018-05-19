package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ua.com.owu.entity.User;
import ua.com.owu.service.MailService;
import ua.com.owu.service.UserService;

import java.io.File;
import java.io.IOException;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private MailService mailService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/saveUserWithAvatarAndSendEmail")
    public String saveUserWithAvatarAndSendEmail(User user , @RequestParam("file") MultipartFile file) throws IOException {
        file.transferTo(
                new File(
                        System.getProperty("user.home")+
                                File.separator +
                                "pics" +
                                File.separator +
                                file.getOriginalFilename()));
        user.setAvatar("/prefixForAva/" + file.getOriginalFilename());
        userService.save(user);

        mailService.sendEmail(user);
        return "index";
    }

    @GetMapping("/allUsers")
    public String allUsers(Model model){
        model.addAttribute("users" , userService.findAll());
        return "allUsers";
    }

    @GetMapping("/rest")
    public String rest(){
        return "restPage";
    }
}
