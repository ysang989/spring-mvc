package hello.servelt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ServeltApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeltApplication.class, args);
	}

}
