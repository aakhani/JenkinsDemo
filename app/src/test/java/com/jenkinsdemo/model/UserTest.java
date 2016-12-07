package com.jenkinsdemo.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Avdhesh AKhani on 12/7/2016.
 */
public class UserTest {

    User u;
    public UserTest(){
        u = new User();
    }

    @Test
    public void UserNameTest() {


        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }

}