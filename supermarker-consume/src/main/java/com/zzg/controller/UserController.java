package com.zzg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zzg.entity.User;

@RestController
public class UserController {
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "error")
	@GetMapping("/user")
    public User findById(@RequestParam(value = "id") Integer id) {
		return restTemplate.getForObject("http://provider/user?id=" + id, User.class);
	}
	
	 public User error(Integer id) {
		 System.out.println("Hystrix 断路器 生效");
	     return new User();
	 }

}
