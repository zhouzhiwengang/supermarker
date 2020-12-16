package com.zzg.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class RestConfig {
	@Bean
	@LoadBalanced //负载均衡标识
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
	
	@Bean // 负载均衡策略实列化
	public IRule getIRule(){
		// 负载均衡：随机策略
		return new RandomRule();
	}
}
