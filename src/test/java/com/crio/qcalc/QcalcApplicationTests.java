package com.crio.qcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QcalcApplicationTests {
	@Test
void testAdd(){
	StandardCalculator calc=new StandardCalculator();
	calc.add(1, 1);
	assertEquals(calc.getResult(),2);
}
@Test
void testSubtract(){
	StandardCalculator calc=new StandardCalculator();
	calc.subtract(2, 1);
	assertEquals(calc.getResult(),1);
}
@Test
void testResult(){
	StandardCalculator calc=new StandardCalculator();
	calc.add(1,2);
	calc.subtract(1,1);
	assertEquals(0,calc.getResult());
	assertNotEquals(3 ,calc.getResult());

}
@Test
void testAddInvalid(){
	StandardCalculator calc=new StandardCalculator();
	Exception e=assertThrows(ArithmeticException.class,()->calc.add(Integer.MAX_VALUE, 1));
	assertTrue(e instanceof ArithmeticException);

}

}
