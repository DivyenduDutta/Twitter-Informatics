package com.divyendu.githubProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.divyendu"})
public class GithubProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubProjectApplication.class, args);
	}
}
