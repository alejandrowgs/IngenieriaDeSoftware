package Practica9;

public class Computer extends InterfaceConnectable {
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
