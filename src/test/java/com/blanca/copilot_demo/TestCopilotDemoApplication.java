package com.blanca.copilot_demo;

import org.springframework.boot.SpringApplication;

public class TestCopilotDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(CopilotDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
