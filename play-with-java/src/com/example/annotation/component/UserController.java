package com.example.annotation.component;

import com.example.annotation.container.RequestMapping;

/**
 * Author: Kishore Reddy
 */

public class UserController {

    @RequestMapping(url = "/login")
    public void doLogin() {
        System.out.println("doLogin()");
    }

    @RequestMapping(url = "/register")
    public void register() {
        System.out.println("register()");
    }

}
