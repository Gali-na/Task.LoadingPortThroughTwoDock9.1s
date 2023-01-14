package org.example;

import org.junit.jupiter.api.Test;

import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PortTest {
    private  Port port= new Port();

    @Test
    void getDockOne_GetNameOfDockOne() {
        assertEquals("Dock One",port.getDockOne().getName());
    }

    @Test
    void getDockTwo_GetNameOfDockTwo() {
        assertEquals("Dock Two",port.getDockTwo().getName());
    }

    @Test
    void getDocks() {
        ArrayDeque<Dock> docksExpected= new ArrayDeque<>(2);
        docksExpected.add(port.getDockOne());
        docksExpected.add(port.getDockTwo());
        assertEquals(docksExpected.peek(),port.getDocks().peek());
        assertEquals(docksExpected.peek(),port.getDocks().peek());
    }

    @Test
    void selectionDock() {
        assertNotEquals(null,port.selectionDock("One"));
    }
}