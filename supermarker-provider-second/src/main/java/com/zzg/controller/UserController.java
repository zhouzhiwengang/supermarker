package com.zzg.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zzg.dao.UserRepository;
import com.zzg.entity.User;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@Value("${server.port}")
	private int port;
	
	@GetMapping("/user")
    public User findById(@RequestParam(value = "id") Integer id) {
		System.out.println("---------------provider-second端口被调用--------------" + port);
		
        return userRepository.findOne(new Specification<User>() {
			
			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				// TODO Auto-generated method stub
				 List<Predicate> predicates = new ArrayList<Predicate>();
	             // 用户编号
	             predicates.add(criteriaBuilder.equal(root.<Integer> get("useId"), id));
	                
				return query.where(predicates.toArray(new Predicate[predicates.size()])).getRestriction();
			}
		}).orElse(null);
    }

}
