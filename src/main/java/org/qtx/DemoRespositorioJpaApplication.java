package org.qtx;

import org.qtx.test.TestArmadoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DemoRespositorioJpaApplication implements CommandLineRunner{

	@Autowired
	TestArmadoras test;
	public static void main(String[] args) {
		SpringApplication.run(DemoRespositorioJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		test.testServicio();		
	}

}
