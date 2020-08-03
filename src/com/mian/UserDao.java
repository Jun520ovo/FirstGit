package com.mian;

import javax.jws.WebService;

import com.entity.User;
@WebService
public class UserDao {
	public User users(User user) {
		return user;
	}
}