package org.example;

import java.util.ArrayDeque;

public class Port {
    private Dock dockOne;
    private Dock dockTwo;

    private ArrayDeque< Dock> docks;

    public Dock getDockOne() {
        return dockOne;
    }

    public Dock getDockTwo() {
        return dockTwo;
    }

    public ArrayDeque<Dock> getDocks() {
        return docks;
    }

    public Port() {
        dockOne =new Dock("Dock One");
        dockTwo =new Dock("Dock Two");
        docks=new ArrayDeque(2) {
        };
        docks.add(dockOne);
        docks.add(dockTwo);
    }

    public  synchronized  Dock selectionDock(String nameShip) {
        Dock currentDock= docks.poll();
        currentDock.writeInformationShipUnloading(nameShip);
        docks.addLast(currentDock);
        return currentDock;
    }
}
