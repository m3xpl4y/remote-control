package at.maximilian.classes;

public class Battery {
    public enum STATUS {EMPTY, LOW, FULL}
    private STATUS status;
    
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
}
