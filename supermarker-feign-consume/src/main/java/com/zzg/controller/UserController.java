package com.zzg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.zzg.entity.User;
import com.zzg.inter.FeignServiceInter;

@RestController
public class UserController {
	@Autowired
	private FeignServiceInter feignServiceInter;

	@GetMapping("/user")
	public User findById(@RequestParam(value = "id") Integer id) {
		return feignServiceInter.findById(id);
	}
}
