package com.JacocoProject.Jacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JacocoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void testMessages(){
		Messages mg= new Messages();
		assertEquals("Hello Mariya!",mg.getMessages("Mariya"));
	}

	@Test
	public void testMessageBlank(){
		Messages mg = new Messages();
		Assertions.assertEquals("please provide a name",mg.getMessages(""));
	}

	@Test
	public void testMessageNull(){
		Messages jc = new Messages();
		Assertions.assertEquals("please provide a name",jc.getMessages(null));
	}

}
