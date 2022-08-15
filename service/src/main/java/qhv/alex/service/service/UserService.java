package qhv.alex.service.service;

import qhv.alex.database.dao.UserDao;
import qhv.alex.service.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id)
                .map(item -> new UserDto());
    }
}
