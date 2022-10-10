package com.example.thewitssocial;

import static org.junit.Assert.*;

import org.junit.Test;

public class FriendsTest {

   private Friends friends = new Friends();


    @Test
    public void inValidNameFalse()  throws  Exception{
        assertTrue(friends.LoadFriends("lola"));
    }

    @Test
    public void NameFalse()  throws  Exception{
        assertTrue(friends.LoadFriends(""));
    }

}