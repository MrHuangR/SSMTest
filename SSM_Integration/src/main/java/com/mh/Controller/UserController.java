package com.mh.Controller;

import com.mh.domain.User;
import com.mh.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl usi;

    @RequestMapping("/uController")
    public String uController(Model model){
        List<User> users = usi.findAll();
        model.addAttribute("user",users);
        return "success";
    }

    @RequestMapping("/uController2")
    public void uController2(User user, String bir, HttpServletRequest request, HttpServletResponse response) throws  Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(bir);
        user.setBirthday(date);
        usi.saveUser(user);
        response.sendRedirect(request.getContextPath()+"/user/uController");
    }

}
