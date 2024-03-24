package vn.edu.iuh.fit.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import vn.edu.iuh.fit.user.entity.User;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @GetMapping("/users")
    public User getUsers() {
        return new User(1, "Thinh");
    }


    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/get-for-object")
    public User getForObject() {
        User user = new User(1, "Thinh");
        return restTemplate.getForObject("/" + user, User.class);
    }

}
