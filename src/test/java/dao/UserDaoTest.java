package dao;
import static org.assertj.core.api.Assertions.*;

import Mokito.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {

    private UserDao dao;

    @Before
    public void setUP() throws Exception {
        this.dao = new UserDaoImpl();
    }
    @Test
    public void getUserByUsernameShouldReturnTrue() throws Exception {
       User vasia = dao.getUserByUsername("vasia@gmail.com");
       assertThat(vasia).isNotNull();
       assertThat(vasia.getUsername()).isEqualTo("vasia@gmail.com");
    }
    @Test
    public void GetUserByUserName() throws Exception{
       User masha = dao.getUserByUsername("masha@gmail.com");
       assertThat(masha).isNotNull();

    }
}