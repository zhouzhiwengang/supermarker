package com.zzg.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zzg.callback.FeignCallBack;
import com.zzg.entity.User;

@FeignClient(value = "provider",fallback = FeignCallBack.class)
public interface FeignServiceInter {
	
	
	@RequestMapping(value = "/user",method = RequestMethod.GET)
    public User findById(@RequestParam(value = "id") Integer id); 

}
