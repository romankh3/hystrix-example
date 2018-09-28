# hystrix-example
Example to explore Hystrix.

## How to use
clone the project and run app `mvn spring-boot:run`


## Hystrix Dashboard
Too see all benefits of the hystrix after runnig an application go to `http://localhost:8080/hystrix` 
and paste `http://localhost:8080/actuator/hystrix.stream` and press the button `Monitor Stream`

After that trigger `http://localhost:8080/rest/hello`
and `http://localhost:8080/rest/helloYT`

and see what's going on with Hystrix Dashboard.

### Thanks for reading
