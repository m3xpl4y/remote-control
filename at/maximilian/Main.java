package at.maximilian;

import at.maximilian.classes.Battery;
import at.maximilian.classes.Remote;
import at.maximilian.classes.Battery.STATUS;

public class Main {
    public static void main(String[] args) {
        Remote remote1 = new Remote(true, true);
        Battery bat1 = new Battery(STATUS.FULL);
        remote1.setBatteries(bat1);
    }
    
}
