package com.example.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloController {
	@GetMapping(value = "/hello")
	public ResponseEntity<String> index() {
		return ResponseEntity.ok("Hello world!");
	}

	@GetMapping(value= "/greeting")
	public ResponseEntity<String> greeting(){
		return ResponseEntity.ok("Good Afternoon");

	}
}


@RestController
public class AllFine{
	@GetMapping (value = "/index")
	public ResponseEntity<String> fine(){
		return ResponseEntity.ok("Tutto ok");
	}

}

@RestController
public class Annotation404{
	@GetMapping(value = "/random")
	public ResponseEntity<String> erroe404(){
		if(new Random().nextBoolean()){
		return ResponseEntity.ok("tutto ok");
	}else {
			return (ResponseEntity<String>) ResponseEntity.badRequest();
		}
}