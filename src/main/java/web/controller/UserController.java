package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserService;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String showUsers(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        model.addAttribute("users", userService.getUsers(count.orElse(0)));
        return "users";
    }


    @PostMapping
    public String create(@RequestParam("name") String name, @RequestParam("age") int age, Model model){

        User user = new User();
        user.setName(name);
        user.setAge(age);

        //дальше надо добавить юзера в БД

        model.addAttribute("user", user);
        return "succesPage";
    }
}