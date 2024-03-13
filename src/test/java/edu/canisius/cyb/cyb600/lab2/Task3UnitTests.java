package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;



public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        // Student should write tests here
        String baseString = "abcdef";

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        ArrayList<String> testableStr = task3.removeDuplicates(baseString);

        assertNotNull(testableStr);
        assertEquals("Doesn't Contain correct Characters", expected, testableStr);
    }

    @Test
    public void test_removeDuplicates_average(){
        // Student should write tests here
        String baseString = "aaabbbcccdddeeefffaa";

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        ArrayList<String> testableStr = task3.removeDuplicates(baseString);

        assertNotNull(testableStr);
        assertEquals("Doesn't Contain correct Characters", expected, testableStr);
    }

    @Test
    public void test_removeDuplicates_worst(){
        // Student should write tests here
        String baseString = null;
        ArrayList<String> expected = new ArrayList<>() ;
        ArrayList<String> testableStr = task3.removeDuplicates(baseString);

        assertNotNull(testableStr);
        assertEquals("Doesn't Contain correct Characters", expected, testableStr);
    }


    @Test
    public void test_areTheseAnagrams_best(){
        // Student should write tests here
        String str1 = "listen";
        String str2 = "silent";
        assertTrue(task3.areTheseAnagrams(str1, str2));
    }

    @Test
    public void test_areTheseAnagrams_average(){
        // Student should write tests here
        String str1 = "listen";
        String str2 = "listens";
        assertFalse(task3.areTheseAnagrams(str1, str2));

    }

    @Test
    public void test_areTheseAnagrams_worst(){
        // Student should write tests here
        String str1 = "hello";
        String str2 = "world";
        assertFalse(task3.areTheseAnagrams(str1, str2));

        //also check nulls
        assertFalse(task3.areTheseAnagrams(null,null));
    }

}
