package com.bjsxt.action;
//
import javax.annotation.Resource;


import org.springframework.stereotype.Controller;


import com.bjsxt.pojo.User;
import com.bjsxt.servicedao.ServiceResDao;
//这里是多例的配置、每一个请求都会有一个action实例 被创建。
//在spring的框架中  action是单例的。
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
//		单例多例的配置测试。
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
