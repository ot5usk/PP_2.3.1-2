package ru.voblikov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.voblikov.model.User;
import ru.voblikov.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getAttributes(Model model) {

        model.addAttribute("newUser", new User());
        model.addAttribute("listUsers", userService.getAllUsers());
        model.addAttribute("updatedParameters", new User());
        return "users";
    }

    @PostMapping
    public String createUser(@ModelAttribute("newUser") User user) {
        userService.createUser(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}")
    public String updateUser(@PathVariable("id") int id, @ModelAttribute("updatedParameters") User updatedParameters) {
        updatedParameters.setId(id);
        userService.updateUser(updatedParameters);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }

    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("list", userService.getAllUsers());
        return "/list";
    }

}
