package org.ahmedgaber.productsmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class ProductsManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsManagerApplication.class, args);
	}

}
