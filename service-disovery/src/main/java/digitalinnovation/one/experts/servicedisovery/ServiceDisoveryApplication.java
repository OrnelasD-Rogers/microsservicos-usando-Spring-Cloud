package digitalinnovation.one.experts.servicedisovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ServiceDisoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDisoveryApplication.class, args);
	}

}
