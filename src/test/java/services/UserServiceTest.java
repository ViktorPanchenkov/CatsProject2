package services;

import Mokito.User;
import dao.UserDao;
import org.junit.Test;

import static org.mockito.BDDMockito.given;

public class UserServiceTest {


    private UserDao dao;

    private UserService userService;


    public UserServiceTest(){
        this.userService = new UserService(dao);
    }

    @Test
    public void checkUserPresence_Should_Return_True() throws Exception {



    }
}
