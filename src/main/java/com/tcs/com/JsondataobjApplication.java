package com.tcs.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.com.model.Student;

@SpringBootApplication
public class JsondataobjApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(JsondataobjApplication.class, args);
		
		Student st = new Student();
		
		st.setStudentId(5);
		st.setStudentName("Ram");
		st.setStudentSkill("Java");
		
		ObjectMapper maper= new ObjectMapper();
		
		String stringJson = maper.writeValueAsString(st);
		System.out.println(stringJson);
		
		
		
	}

}
