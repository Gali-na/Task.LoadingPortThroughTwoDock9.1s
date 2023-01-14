package org.example;
import java.util.ArrayList;

public class Dock {
    String name;
    private ArrayList<String> informationShipUnloading;
    public Dock(String nameDock) {
        this.name =nameDock;
        this.informationShipUnloading = new ArrayList<String>();
        informationShipUnloading.add( this.name);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getInformationShipUnloading() {
        return informationShipUnloading;
    }

    public synchronized ArrayList<String> writeInformationShipUnloading(String nameShip) {
        int countBox = 10;
        while (countBox > 0) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            informationShipUnloading.add(nameShip);
          --countBox;
        }
        return informationShipUnloading;
    }
}
