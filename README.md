* A Web Application of Apache Spark using Spring Boot MVC to read Wuzzuf dataset downloaded form Kaggle.com




-  Create a Maven-Based Spring Boot Project
- Add the required dependencies in pom.xml
-  Configure Spark Properties in application.properties
-  Adding the Spark ApplicationConfig: declaring the JavaSparkContext and SparkConf as beans (using @Bean annotation) this tell the spring container to manage them for us
-  Creating a service/controller for Read Csv & Register a REST Controller with an endpoint
-  Run the application, Test your application from a REST client or on Browser
   Url: http://localhost:9999/reading

   
   
   
   
   
   

   *just run the program, and use request mapping to test each function
  charts in /public folder 
  visualize the charts using request mapping :
	*localhost:8081/pie
	*localhost:8081/bar1
	*localhost:8081/bar2

   *to see YearsExp column after factorization:	localhost:8081/factorizeYrsOfExp
 
   