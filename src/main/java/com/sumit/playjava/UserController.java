package com.sumit.playjava;

import com.sumit.playjava.model.Response;
import com.sumit.playjava.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class UserController {
    private ArrayList<User> users = new ArrayList<User>();
    public UserController(){
        User ul = new User("admin","admin123");
        users.add(ul);
        ul = new User("test","test123");
        users.add(ul);
    }

    @RequestMapping(value = "/login")
    public Response checkLogin(@RequestParam("uname") String userName, @RequestParam("pass") String password){
        Response response = new Response();
        boolean check = false;
        String msg = "Login Fail";
        for(User u:users){
            if(u.getUserName().equals(userName)&& u.getPassword().equals(password)){
                check = true;
                msg= "Login success";
                break;
            }
        }
        response.setStatus(check);
        response.setMessage(msg);
        return response;
    }
}
