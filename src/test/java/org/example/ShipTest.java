package org.example;

import org.junit.jupiter.api.Test;

import java.util.AbstractList;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {
    private  Ship ship;
    private Port port = new Port();

    @Test
    void dockSelection_SetNameIsEmptyString_GetErorMessage() {
        AbstractList<String> rezult = new ArrayList<>();
        rezult.add("Information about Ship is not corect");
        ship= new Ship("",port);
        assertEquals(rezult,ship.dockSelection());
    }
    @Test
    void dockSelection_SetNameIsNull_GetErorMessage() {
        AbstractList<String> rezult = new ArrayList<>();
        rezult.add("Information about Ship is not corect");
        ship= new Ship("",port);
        assertEquals(rezult,ship.dockSelection());
    }

    @Test
    void dockSelection_PortIsNull_GetErorMessage() {
        AbstractList<String> rezult = new ArrayList<>();
        rezult.add("Information about Ship is not corect");
        ship= new Ship("1",null);
        assertEquals(rezult,ship.dockSelection());
    }
    @Test
    void dockSelection_SetCorectInformation_GetInformationAboutLoading() {
        ship= new Ship("1",port);
        assertEquals("1",ship.dockSelection().get(1));
    }
}