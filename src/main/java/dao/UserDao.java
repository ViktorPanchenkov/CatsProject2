package dao;

import Mokito.User;

public interface UserDao {

   User getUserByUsername(String username) throws Exception;
}
