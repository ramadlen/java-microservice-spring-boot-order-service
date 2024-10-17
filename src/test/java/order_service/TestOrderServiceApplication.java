package order_service;

import org.springframework.boot.SpringApplication;

import order_service.OrderServiceApplication;


public class TestOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(OrderServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
