package at.maximilian.classes;

import java.util.List;

public class Battery {
    public enum STATUS {EMPTY, LOW, FULL}
    private STATUS status;
    private Remote remote;
    private boolean hasPower;
    //CONSTRUCTOR
    public Battery(STATUS status) {
        this.status = status;
    }
    //GETTER & SETTER
    public STATUS getStatus() {
        return status;
    }
    public void setStatus(STATUS status) {
        this.status = status;
    }
    public Remote getRemote() {
        return remote;
    }
    public void setRemote(Remote remote) {
        this.remote = remote;
    }
    public boolean isHasPower() {
        return hasPower;
    }
    public void setHasPower(boolean hasPower) {
        this.hasPower = hasPower;
    }
    //FUNCTIONS
    public void chargingStatus()
    {
        System.out.println("Ladestatus: ");
        System.out.println("Batterie: " + getStatus());
    }
}
