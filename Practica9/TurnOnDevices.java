import Practica9.InterfaceConnectable;
import Practica9.Lamp;
import Practica9.Computer;
import Practica9.CoffeeMaker;   // Importamos las clases necesarias


public class TurnOnDevices {    // Codigo dado por el ejercicio

    public static void main(String[] args) {
   
        turnOnDevice(new Lamp());
        turnOnDevice(new Computer());
        turnOnDevice(new CoffeeMakerAdapter());
    }
   
    private static void turnOnDevice(InterfaceConnectable device) {
        device.turnOn();
        System.out.println(device.isOn());
    }
   }

   class CoffeeMakerAdapter implements InterfaceConnectable {
    private CoffeeMaker coffeeMaker = new CoffeeMaker(); 
        public boolean isOn() { 
            return ! coffeeMaker.isOff(); 
            } 
        public void turnOn() { 
            coffeeMaker.turnOn(); 
            } 
        public void turnOff() { 
            coffeeMaker.turnOff();
            } 
    }