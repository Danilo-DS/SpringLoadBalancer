package br.com.springloadbalance.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.springloadbalance.config.FeignClientConfig;

@FeignClient(name = "balancer-request", path = "/product/instance", configuration = FeignClientConfig.class)
public interface FeignClientService {
	
	@GetMapping
	@LoadBalanced
	public String getInstance();
	
}
