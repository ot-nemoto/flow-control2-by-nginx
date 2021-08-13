package jp.co.opentone.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppApplication {

	@RequestMapping("/")
	public String home() {
		return "demo-app";
	}

	@RequestMapping("/1.html")
	public String home1() {
		return "1";
	}

	@RequestMapping("/2.html")
	public String home2() {
		return "2";
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
