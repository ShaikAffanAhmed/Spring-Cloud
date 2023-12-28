package com.app.affan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.app.affan.entity.Student;

import ch.qos.logback.core.net.SyslogOutputStream;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class TestProducerCallRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
	   //1. Create webclient object using base URL
	    WebClient client = WebClient.create("http://localhost:9090/student");
		
	  //call: 
	    /*
	    Mono<Student> result = 
		          client
		          .post() //HttpMethod
		          .uri("/create") // PATH
	              .body(Mono.just(new Student("AA256", "SAM", 300.0)), Student.class) //Body
	              .retrieve() //execute
		          .bodyToMono(Student.class); // convert Response
	    
	    System.out.println("FROM CONSUMER  --->");
	    //access result
	    result.subscribe(System.out::println);*/
	    
	    /*
	     Flux<Student> flux = client.get().uri("/all").retrieve().bodyToFlux(Student.class);
	     flux.doOnNext(System.out::println).blockLast();
	     */
	    
	    Mono<Student> result = 
	    client.get().uri("/fetch/AA256").retrieve()
	    .bodyToMono(Student.class);
	    result.subscribe(System.out::println);
	}
}
