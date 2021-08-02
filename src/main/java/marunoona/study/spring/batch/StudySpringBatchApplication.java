package marunoona.study.spring.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing // Batch 실행 설정
@SpringBootApplication
public class StudySpringBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudySpringBatchApplication.class, args);
	}

}
