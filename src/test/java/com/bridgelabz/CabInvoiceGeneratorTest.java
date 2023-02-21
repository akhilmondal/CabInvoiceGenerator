package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    @Test // By creating object of CabInvoiceGenerator class we are checking the expected fare as return.
    public void givenDistaneAndTimeShouldReturnFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double fare = cabInvoiceGenerator.calculateFare(5.5, 3.5);
        Assert.assertEquals(58.5, fare, 0.0);
    }

    @Test // Here is the second test case on the same method for the minimum fare in return which is 5.
    public void givenDistaneAndTimeShouldReturnMinimumFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double fare = cabInvoiceGenerator.calculateFare(0.4, 0.5);
        Assert.assertEquals(5, fare, 0.0);
    }
}
