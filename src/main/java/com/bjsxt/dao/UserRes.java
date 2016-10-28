package com.bjsxt.dao;

import com.bjsxt.pojo.User;

public interface UserRes {
	public User Find(int id);
	public void Save(User user);

}
