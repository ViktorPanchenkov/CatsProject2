package services;

import Mokito.User;
import dao.UserDao;

public class UserService {

    private UserDao dao;
    public UserService(UserDao dao){
        this.dao =dao;
    }
    public boolean CheckUserPresence(User user) throws Exception {
      User u = dao.getUserByUsername(user.getUsername());

      return u != null;
    }
}
