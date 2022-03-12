package br.com.springloadbalance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springloadbalance.service.FeignClientService;

@RestController
@RequestMapping(value = "/loadBalancer")
public class LoadBalancerController {
	
	@Autowired
	private FeignClientService feignClient;
	
	@GetMapping
	public String getPort() {
		return feignClient.getInstance();
	}
}
