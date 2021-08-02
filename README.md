# spring-batch-study

해당 Repository는 Spring Batch + Docker + Mysql 을 활용한 간단한 예제코드를 포함합니다.   
- docker-compose.yml 을 사용하여 mysql에 접속
- 메타테이블 생성
    - IDE에서 검색되는 schema-mysql.sql 파일 사용   



***


```@EnableBatchProcessing```   
    Spring Batch 기능 활성화 어노테이션

```.tasklet((contribution, chunkContext))```   
Step 안에서 수행될 기능들을 명시   
Tasklet은 Step안에서 단일로 수행될 커스텀한 기능들을 선언할때 사용
