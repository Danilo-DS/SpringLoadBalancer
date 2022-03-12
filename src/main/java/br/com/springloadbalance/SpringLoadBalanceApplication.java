package br.com.springloadbalance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringLoadBalanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLoadBalanceApplication.class, args);
	}

}
