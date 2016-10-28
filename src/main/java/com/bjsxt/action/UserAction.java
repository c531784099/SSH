package com.bjsxt.action;
//
import javax.annotation.Resource;


import org.springframework.stereotype.Controller;


import com.bjsxt.pojo.User;
import com.bjsxt.servicedao.ServiceResDao;
//�����Ƕ��������á�ÿһ�����󶼻���һ��actionʵ�� ��������
//��spring�Ŀ����  action�ǵ����ġ�
//@Scope("prototype")

@Controller
public class UserAction {
	@Resource
	private ServiceResDao serviceResDaoImp;
	private User user;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		System.out.println("====");
		this.user = user;
		
	}

	public String doRun(){
//		�������������ò��ԡ�
		System.out.println(this);
		
		String str=serviceResDaoImp.Res(user);
	
		if(str.equals("success")){
			System.out.println("action========");
			return "success";
		}else{
			
			return "login";
		}
		
		
		
		
		
	}

}
