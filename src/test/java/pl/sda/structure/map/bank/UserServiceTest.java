package pl.sda.structure.map.bank;

import org.junit.Test;
import pl.sda.structure.map.bank.model.BankUser;

import static org.junit.Assert.*;

public class UserServiceTest {

    private UserService userService = new UserService();

    @Test
    public void createUser() {
        userService.createUser(1L,"login","Jan", "Kowalski");
        assertEquals(1,userService.getAllUsers());
    }

    @Test
    public void getUserById() {
        userService.createUser(1L,"login123","Jan", "Kowalski");
        userService.createUser(2L,"mag234","Wincenty", "Witos");
        userService.createUser(3L,"dfw34","Zenek", "Smetnka");

        BankUser userById = userService.getUserById(3l);
    }

}