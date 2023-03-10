package com.kodilla.stream.invoice;

import com.kodilla.stream.invoice.simple.SimpleInovice;
import com.kodilla.stream.invoice.simple.SimpleItem;
import com.kodilla.stream.invoice.simple.SimpleProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleInvoiceTestSuite {
    @Test
    void testGetValueToPay() {
        //Given
        SimpleInovice invoice = new SimpleInovice();
        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3", 6.49), 5.0));
        //Then
        assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }
}
