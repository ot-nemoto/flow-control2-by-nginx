package jp.co.opentone.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@SpringBootApplication
@RestController
public class AppApplication {

	@RequestMapping("/")
	public String home() {
		return "demo-app";
	}

	@RequestMapping("/1.html")
	public String html1() {
		return "1";
	}

	@RequestMapping("/2.html")
	public String html2() {
		return "2";
	}

	@RequestMapping(path = "/3.html", method = POST)
	public String html3() {
		return "3";
	}

	@RequestMapping(path = "/4.html", method = POST)
	public String html4() {
		return "4";
	}

	@RequestMapping(path = "/5.html", method = POST)
	public String html5() {
		return "5";
	}

	@RequestMapping(path = "/6.html", method = POST)
	public String html6() {
		return "6";
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
