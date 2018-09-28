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

### Also if you're interesting - see my other repositories: 
* [Movie Tracking](https://github.com/romankh3/movietracking) Simple API for tracking movies with favorite actors for the specific time.
* [Tic Tac Toe NxM](https://github.com/romankh3/tictactoe)- Own implementation. For any rectangle and any winner line count. 
* [Image Comparison](https://github.com/romankh3/image-comparison) - The program in Java that compares 2 images with the same sizes and shows the differences visually by drawing rectangles.

