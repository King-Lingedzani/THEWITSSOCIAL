package com.example.thewitssocial;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

    private User user = new User();



    @Test
    public void aValidName()  throws  Exception{
        assertTrue(user.isNameEmpty(""));
    }

    @Test
    public void ainvalidName() throws Exception{
        assertTrue(user.isNameEmpty("line"));
    }

    @Test
    public void aValidSurname()  throws  Exception{
        assertTrue(user.isSurnameEmpty(""));
    }

    @Test
    public void ainvalidSurname() throws Exception{
        assertTrue(user.isSurnameEmpty("line"));
    }



    @Test
    public void aValidPhone()  throws  Exception{
        assertTrue(user.isPhoneEmpty(""));
    }

    @Test
    public void ainvalidPhone() throws Exception{
        assertTrue(user.isPhoneEmpty("line"));
    }



    @Test
    public void aValidPassword()  throws  Exception{
        assertTrue(user.isPasswordEmpty(""));
    }

    @Test
    public void ainvalidPassword() throws Exception{
        assertTrue(user.isPasswordEmpty("line"));
    }


    @Test
    public void aValidEmail()  throws  Exception{
        assertTrue(user.isEmailEmpty(""));

    }

    @Test
    public void ainvalidEmail() throws Exception{
        assertTrue(user.isEmailEmpty("line"));
    }

}