package com.zzg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class EurekaZuulApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(EurekaZuulApplication.class, args);
	}

}
