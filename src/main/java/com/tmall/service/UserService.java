package com.tmall.service;

import com.tmall.javaBeans.User;
import com.tmall.javaBeans.responBean;

public interface UserService {

    public responBean FindUser(User user);
    public int creatUse(User use);
    public responBean updateUser(User use);
}
