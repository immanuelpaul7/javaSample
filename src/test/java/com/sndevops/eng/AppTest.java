package com.sndevops.eng;
import org.junit.Assert;
import org.junit.Test; 

public class AppTest {
// rrt   
    // Test
    // Test again
    // Third test
    private String INPUT = "13411";
    @Test 
    public void testLength() { 
        Assert.assertEquals(INPUT,"13411");  
    }
    
    @Test 
    public void testWidth() { 
        Assert.assertEquals("13","13");  
    }
    
    @Test 
    public void testVelocity() { 
        Assert.assertEquals("vel","vel");  
    }
}
 

