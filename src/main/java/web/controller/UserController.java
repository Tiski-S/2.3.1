package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;
@Controller
@ControllerAdvice
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
//working
    @RequestMapping(method = RequestMethod.GET)
    public String printUsers(ModelMap model) {
        model.addAttribute("users", userService.getUsers());
        return "users";
    }

//working
    @GetMapping("/new")
    public String newUser(@ModelAttribute("users") User user) {
        return "new";
    }
//working
    @PostMapping()
    public String createUser(@ModelAttribute("users") User user) {
        userService.addUser(user);
        return "redirect:/users";
    }
//working
    @GetMapping("/{id}/edit")
    public String editUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("users", userService.getUserById(id));
        return "edit";
    }
//working
    @PatchMapping("/{id}")
    public String updateUser(@ModelAttribute("users") User user, @PathVariable("id") int id) {
        userService.update(id,user);
        return "redirect:/users";
    }

//working
@DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.delete(id);
        return "redirect:/users";
    }
}
