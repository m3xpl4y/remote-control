package at.maximilian.classes;

import java.util.List;

public class Remote {
    private boolean isOn;
    private boolean hasPower;
    private List<Battery> batteries;
    //CONSTRUCTOR

    public Remote() {
    }

    //GETTER & SETTER
        public boolean isOn() {
            return isOn;
        }
        public void setOn(boolean isOn) {
            this.isOn = isOn;
        }
        public boolean isHasPower() {
            return hasPower;
        }
        public void setHasPower(boolean hasPower) {
            this.hasPower = hasPower;
        }
        public List<Battery> getBatteries() {
            return batteries;
        }
        public void setBatteries(List<Battery> batteries) {
            this.batteries = batteries;
        }

    //FUNCTIONS
        public void turnOn()
        {
            if(batteries.get(0).getStatus() == Battery.STATUS.EMPTY && batteries.get(1).getStatus() == Battery.STATUS.EMPTY) {
                System.out.println("Batterien sind Leer, bitte wechseln");
                setOn(false);
            }
            else
            {
                setOn(true);
                System.out.println("Fernbedienung funktioniert");

            }
        }
        public void turnOff()
        {
            setOn(false);
            System.out.println("Ausgeschaltet");
        }
        public void getStatus()
        {
            System.out.println("STATUS Batterie 1: " + getBatteries().get(0).getStatus());
            System.out.println("STATUS Batterie 1: " + getBatteries().get(1).getStatus());
        }
}
