package com.example.qwixx;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = QwixxApplication.class)
class QwixxApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(1, 1);
	}

}
