package com.lnt.spring_boot_demo2;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemo2ApplicationTests {

	@Test
	public void testBasic(){
		int input = 3;
		int result = input * 2;
		assertSame(6, result);
	}

}
