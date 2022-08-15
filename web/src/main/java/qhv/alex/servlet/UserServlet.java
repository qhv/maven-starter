package qhv.alex.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qhv.alex.service.dto.UserDto;
import qhv.alex.service.service.UserService;

import java.io.IOException;
import java.util.function.Supplier;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

    private static UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var user = userService.getUser(3L);
    }
}
