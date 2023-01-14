package org.example;

import java.util.AbstractList;
import java.util.ArrayList;

public class Ship implements Runnable {
    private String name;
    private Port port;
    public Ship() {
    }

    public Ship(String name, Port port) {
        this.name = name;
        this.port = port;
    }


    public AbstractList<String> dockSelection() {
        AbstractList<String> rezult = new ArrayList<>();
        rezult.add("Information about Ship is not corect");
        if(this.name!=null && this.port!=null && this.name!=""){
            Dock dock = this.port.selectionDock(this.name);
            rezult= dock.getInformationShipUnloading();
        }
        return rezult;
    }

    public void run() {
        System.out.println(dockSelection());
    }
}

