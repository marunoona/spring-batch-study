package marunoona.study.spring.batch.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Job 은 하나 이상의 Step을 가지기 때문에
 * Step을 Bean으로 만들어서 실행할 Job에 등록을 해야한다.
 * 아래와 같이 Job을 만들어 Bean으로 등록할 수 있다.
 */
@Slf4j
@Configuration
@RequiredArgsConstructor
public class JobConfiguration {

    private final JobBuilderFactory jobBuilderFactory;      //생성자 DI
    private final StepBuilderFactory stepBuilderFactory;    //생성자 DI

    @Bean
    public Job job(){
        /**
         * simpleJob 이란 이름의 Batch Job을 생성
         * job의 이름은 별도로 지정하지 않고, Builder를 통해 지정
         */
        return jobBuilderFactory.get("simpleJob")
                .start(step1())
                .next(step2())
                .build();
    }

    @Bean
    public Step step1(){
        /**
         * step1 이란 이름의 Batch Step을 생성
         * Builder를 통해 이름을 지정
         */
        return stepBuilderFactory.get("step1")
                .tasklet(((contribution, chunkContext) -> {
                    log.info(">>>> This is Step1");
                    return RepeatStatus.FINISHED;
                })).build();
    }

    @Bean
    public Step step2() {
        return stepBuilderFactory.get("step2").tasklet((stepContribution, chunkContext) -> {
            log.info(">>>> This is Step2");
            return RepeatStatus.FINISHED;
        }).build();
    }
}
