package br.com.springloadbalance.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

@Configuration
public class LoadBalancerConfig {
	
	@Bean
	public ServiceInstanceListSupplier serviceInstanceListSupplier() {
		return new ServiceInsanceConfig("loadBalancer");
	}
	
}

@AllArgsConstructor
class ServiceInsanceConfig implements ServiceInstanceListSupplier{

	private final String serviceId;
	
	@Override
	public Flux<List<ServiceInstance>> get() {
		// TODO Auto-generated method stub
		return Flux.just(Arrays.asList(
						new DefaultServiceInstance(serviceId + "1", serviceId, "localhost", 57679, false),
		                new DefaultServiceInstance(serviceId + "2", serviceId, "localhost", 57686, false)
		                ));
	}

	@Override
	public String getServiceId() {
		// TODO Auto-generated method stub
		return serviceId;
	}
	
}
