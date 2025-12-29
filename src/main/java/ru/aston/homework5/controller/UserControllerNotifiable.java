package ru.aston.homework5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.aston.homework4.controller.UserController;
import ru.aston.homework5.service.UserServiceNotifiable;

@RestController
@RequestMapping("/v2/users")
public class UserControllerNotifiable extends UserController {
    public UserControllerNotifiable(UserServiceNotifiable userService) {
        super(userService);
    }
}
