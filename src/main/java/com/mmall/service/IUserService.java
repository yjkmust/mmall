package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by 11432 on 2019/3/26.
 */
public interface IUserService {
    ServerResponse<User> login(String userName, String passWord);
    ServerResponse<String> register(User user);
    ServerResponse<String> checkValid(String str, String type);
}
