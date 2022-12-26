package in.nareshit.hari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsExForDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsExForDeploymentApplication.class, args);
	}
	
	@GetMapping("/")
	public String getData() {
		
		return "Welcome To Jenkins CICD Pipeline";
	}
}
