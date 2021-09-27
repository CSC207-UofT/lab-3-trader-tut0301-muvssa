/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class DogTest {
    Dog d;

    @Before
    public void setUp() throws Exception {
        d = new Dog();
    }

    @Test(timeout = 50)
    public void sound() {
        assertEquals("Bark", d.sound());
    }


    @Test(timeout = 50)
    public void getPrice() {
        assertEquals(1, d.getPrice());
    }

}