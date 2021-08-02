# spring-batch-study

해당 Repository는 Spring Batch + Docker + Mysql 을 활용한 간단한 예제코드를 포함합니다.

***

### Spring Batch
@EnableBatchProcessing
    Spring Batch 기능 활성화 어노테이션

''' .tasklet((contribution, chunkContext)) '''
    Step 안에서 수행될 기능들을 명시합니다.
    Tasklet은 Step안에서 단일로 수행될 커스텀한 기능들을 선언할때 사용합니다.
    여기서는 Batch가 수행되면 log.info(">>>>> This is Step1") 가 출력되도록 합니다.