package com.gora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoraApplicationTests {

	@Test
	void dumbTest() {
		//Isso vai morrer no futuro
		Assertions.assertEquals(1, 1);
	}

}
