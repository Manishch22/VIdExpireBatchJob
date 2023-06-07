package newbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan("newbatch.*")
@EnableBatchProcessing
@EnableScheduling
public class NewbatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewbatchApplication.class, args);
	}

}
