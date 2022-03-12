package br.com.springloadbalance.config;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

@Configuration
@LoadBalancerClient(name = "loadBalancer", configuration = LoadBalancerConfig.class)
public class FeignClientConfig {
	
	@Bean
	public Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}
	
}
