package com.jenkinsdemo.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Avdhesh AKhani on 12/7/2016.
 */
public class UserTest {


    public UserTest(){

    }

    @Test
    public void UserNameTest() {

        User u = new User();
        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }
    @Test
    public void FailTest(){
        Assert.assertFalse(true);
    }

}