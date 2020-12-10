package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.model.implementation.User;
import ua.lviv.iot.service.IGeneralService;
import ua.lviv.iot.service.implementation.GeneralService;
import ua.lviv.iot.service.implementation.UserService;

public class UserController extends GeneralController<User> {

    private final GeneralService<User> userService = new UserService();

    @Override
    public final IGeneralService<User> getService() {
        return userService;
    }

}
