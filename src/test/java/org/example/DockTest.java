package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DockTest {
     private Dock dock;
    @Test
    void getName_CreateDock_GetName() {
        dock = new Dock("OneDock");
        assertEquals("OneDock",dock.getName());
    }

    @Test
    void getInformationShipUnloading() {
        dock = new Dock("OneDock");
        dock.writeInformationShipUnloading("1");
        ArrayList<String> expectedRezult= new ArrayList<>();
        expectedRezult.add("OneDock");
        for(int i=0; i<10; i++) {
            expectedRezult.add("1");
        }
        assertEquals( expectedRezult,dock.getInformationShipUnloading());
    }

    @Test
    void writeInformationShipUnloading() {
        dock = new Dock("OneDock");
        dock.writeInformationShipUnloading("1");
        ArrayList<String> expectedRezult= new ArrayList<>();
        expectedRezult.add("OneDock");
        for(int i=0; i<10; i++) {
            expectedRezult.add("1");
        }
        assertEquals( expectedRezult,dock.getInformationShipUnloading());
    }
}