package com.johnwayodi.flightreservation.controllers;

import com.johnwayodi.flightreservation.models.User;
import com.johnwayodi.flightreservation.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/showReg")
    public String showRegistrationPage(){
        return "login/registerUser";
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String register(@ModelAttribute("user") User user){
        userRepository.save(user);
        return "login/login";
    }

    @RequestMapping("/showLogin")
    public String showLoginPage(){
        return "login/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        ModelMap modelMap){
        User user = userRepository.findByEmail(email);
        if (user.getPassword().equals(password)){
            return "findFlights";
        }else {
            modelMap.addAttribute("msg", "Incorrect password!! Try again");
        }
        return "login/login";
    }
}
