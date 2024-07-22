package Practica9;

public class Lamp extends InterfaceConnectable {
    private boolean on = false;
    
    public boolean isOn() {
        return on;
    }
    
    public void turnOn() {
        on = true;
    }
    
    public void turnOff() {
        on = false;
    }
    
}
