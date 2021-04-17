package at.maximilian;

import at.maximilian.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Battery bat1 = new Battery(Battery.STATUS.EMPTY);
        Battery bat2 = new Battery(Battery.STATUS.LOW);
        List<Battery> batteryList = new ArrayList<>();
        batteryList.add(bat1);
        batteryList.add(bat2);
        Remote remote1 = new Remote();
        remote1.setBatteries(batteryList);

        remote1.getStatus();
        remote1.turnOn();
        remote1.turnOff();
        batteryList.get(0).chargingStatus();
        batteryList.get(1).chargingStatus();
    }
    
}
