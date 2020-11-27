package com.tangyu.springmvc.config;

import com.tangyu.springmvc.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping({"/"})
public class HomeController {

    private List<User> generateUserList() {
        List<User> userList = new ArrayList<User>();
        userList.add(new User());
        return userList;
    }


    @RequestMapping(value = "add" ,method = POST)
    public String home(User user, Model model) {

//        User user = new User();
//        user.setName("Jim");
//        user.setId(count);
        model.addAttribute("name", user.getName());
        model.addAttribute("id", user.getId());
        return "intro";
    }

    @RequestMapping(method = GET)
    public ModelAndView home(@RequestParam(value="count", defaultValue = "1") int count){
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("count", count + 1);
        return mav;
    }

}
