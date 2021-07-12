package dao;

import Mokito.User;

import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private List<User> users;

    public UserDaoImpl() {
        this.users = Arrays.asList(
                new User("vasia@gmail.com","GUEST"),
                new User("kolia@gmail.com","USER"),
                new User("vika@gmail.com","ADMIN"),
                new User("olga@gmail.com","USER")
        );
    }

    @Override
    public User getUserByUsername(String username) throws Exception {
       return users.stream().filter(user -> user.getUsername().equals(username))
               .findAny().orElse(null);
    }
}
