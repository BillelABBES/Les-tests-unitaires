package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    static Calculator calculator;

    @BeforeAll
    public static void initCalculator(){
//        System.out.println("beforeAll");
        calculator = new Calculator();
    }

//    @BeforeEach
//    public void beforeEach(){
//        System.out.println("beforeEach");
//    }

    @Test
    public void additionTest(){
        List<Integer[]> list = new ArrayList<>();
        list.add(new Integer[]{1,2,3});
        list.add(new Integer[]{-2,-5,-7});
        list.add(new Integer[]{5,-5,0});
        list.add(new Integer[]{0,-5,-5});
        list.add(new Integer[]{3,0,3});
        int result;
        for (Integer[] tab : list){
            result = calculator.addition(tab[0], tab[1]);
            assertEquals(tab[2], result);
        }
    }

    @Test
    public void multiplicationTest(){
        List<Integer[]> list = new ArrayList<>();
        list.add(new Integer[]{1,2,2});
        list.add(new Integer[]{-2,-5,10});
        list.add(new Integer[]{5,-5,-25});
        list.add(new Integer[]{0,-5,0});
        list.add(new Integer[]{3,0,0});
        int result;
        for (Integer[] tab : list){
            result = calculator.multiplication(tab[0], tab[1]);
            assertEquals(tab[2], result);
        }
    }

    @Test
    public void testDivision(){
        List<Integer[]> list = new ArrayList<>();
        list.add(new Integer[]{1,2,0});
        list.add(new Integer[]{-5,-2,2});
        list.add(new Integer[]{5,-5,-1});
        list.add(new Integer[]{0,-5,0});
        int result ;
        for (Integer[] tab : list){
            result = calculator.division(tab[0], tab[1]);
            assertEquals(tab[2], result);
        }
        assertThrows(
                Exception.class,
                () -> {
                    calculator.division(5, 0);
                }
        );
    }
}
