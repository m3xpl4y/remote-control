package at.maximilian.classes;

public class Remote {
    private boolean isOn;
    private boolean hasPower;
    private Battery batteries;
    //CONSTRUCTOR
        public Remote(boolean isOn, boolean hasPower) {
        this.isOn = isOn;
        this.hasPower = hasPower;
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
        public Battery getBatteries() {
            return batteries;
        }
        public void setBatteries(Battery batteries) 
        {
        this.batteries = batteries;
        }
    //FUNCTIONS
        public void turnOn()
        {

        }
        public void turnOff()
        {

        }
}
