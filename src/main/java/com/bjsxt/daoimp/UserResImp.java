package com.bjsxt.daoimp;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.bjsxt.dao.UserRes;
import com.bjsxt.pojo.User;
@Repository
public class UserResImp implements UserRes {
	
    @Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public User Find(int id) {
		System.out.println("====finduser");
	Session session=	sessionFactory.getCurrentSession();
//	清除session中的缓存
//	session.clear();
//	使用get立即查询 不使用缓存
	return (User) session.get(User.class, id);	
		
		
		
	}
//保存对象
	@Override
	public void Save(User user) {
		sessionFactory.getCurrentSession().save(user);

	}

}
