package com.revature.junit.example;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
private static final String Second = null;
Calculator c=new Calculator();

@Test
@Order(3)
public void addTest() {
	int actualResult= c.add(10,10);
	System.out.println("Testing the add method...");
	Assertions.assertEquals(20, actualResult);
}
@Test
@Order(2)
//@Tag(value="second")
public void subTest() {
	int actualResult= c.sub(88,8);
	System.out.println("Sub Method...");
	Assertions.assertEquals(80, actualResult);
	
}

@Test
@Order(1)
public void multiplyTest() {
	int actualResult=c.multiply(4,3);
	System.out.println("Multiply Method...");
	Assertions.assertEquals(12, actualResult);
}
@BeforeEach
public void beforeEachTest() {
	System.out.println("** Before Each **");
}
@AfterAll
public static void afterAll() {
	System.out.println("Game Over...");
}
}
