package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CodingBatTest {
    CodingBat codingBat = new CodingBat();


    void helloName() {
        assertEquals("Hello Bob!", codingBat.helloName("Bob"));
        assertEquals("Hello Bartosz!", codingBat.helloName("Bartosz"));
        assertEquals("Hello Ben!", codingBat.helloName("Ben"));
    }

    @org.junit.jupiter.api.Test
    void sum67() {
        assertEquals(5,codingBat.sum67(new int[]{1, 2, 2}));
        assertEquals(5,codingBat.sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
        assertEquals(4,codingBat.sum67(new int[]{1, 1, 6, 7, 2}));
    }
    @org.junit.jupiter.api.Test
    void sleepIn(){
        assertEquals(true,codingBat.sleepIn(false, false));
        assertEquals(false,codingBat.sleepIn(true, false));
        assertEquals(true,codingBat.sleepIn(false, true));
    }
    @org.junit.jupiter.api.Test
    void diff21(){
        assertEquals(0,codingBat.diff21(21));
        assertEquals(58,codingBat.diff21(50));
        assertEquals(1,codingBat.diff21(20));
    }
    @org.junit.jupiter.api.Test
    void mapAB2(){
        assertEquals(Map.of("c", "cake"), codingBat.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"))));
        assertEquals(Map.of("a", "aaa", "b", "bbb"), codingBat.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb"))));
        assertEquals(Map.of("a", "aaa", "b", "bbb", "c", "aaa"), codingBat.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"))));
    }
}