package com.bjsxt.aop;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.bjsxt.action.UserAction;
import com.bjsxt.servicedao.ServiceResDao;

//����spring ����  
// ע��Ϊ����
//@Component
@Aspect
@Component
public class Function {
	
	
	@Before(value = "execution(* com.bjsxt.servicedaoimp.*.*(..))")
	public void before(){
		
		System.out.println("before������Ϣ===");
		return;
		
	}
	@After(value = "execution(* com.bjsxt.servicedaoimp.*.*(..))")
	public  void after(){
		System.out.println("after========");
	
	}

}
