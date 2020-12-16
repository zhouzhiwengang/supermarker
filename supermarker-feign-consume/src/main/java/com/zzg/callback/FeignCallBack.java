package com.zzg.callback;

import org.springframework.stereotype.Component;

import com.zzg.entity.User;
import com.zzg.inter.FeignServiceInter;

@Component
public class FeignCallBack implements  FeignServiceInter{

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		 System.out.println("Feign 之Hystrix 断路器 生效");
	     return new User();
	}

}
