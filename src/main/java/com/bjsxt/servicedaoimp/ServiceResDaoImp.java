package com.bjsxt.servicedaoimp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bjsxt.dao.UserRes;
import com.bjsxt.pojo.User;
import com.bjsxt.servicedao.ServiceResDao;
@Service
public class ServiceResDaoImp implements ServiceResDao {
	@Resource
	private UserRes userResImp;

	@Override
	public String Res(User user) {
//		�ж�  ����Ѿ�������ʲôҲ����
		System.out.println("find========");
		User u1=userResImp.Find(user.getUid());
		System.out.println("===find");
		if(u1==null){
			System.out.println("sucess=======");
			userResImp.Save(user);
			return "success";
		}else{
			System.out.println("login");
			return "login";
		}

	}

}
