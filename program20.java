//Create an interface that defines a common ability (for example Switchable, Printable, Chargeable, or Playable).
interface Switchable {
   void turnOn();
    void turnOff();
}class Light implements Switchable {

    public void turnOn() {
        System.out.println("Light is ON. Room is bright.");
    }
    public void turnOff() {
        System.out.println("Light is OFF. Room is dark.");
    }
}
class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan is ON. Fan is rotating.");
    }
    public void turnOff() {
        System.out.println("Fan is OFF. Fan has stopped.");
    }
}
class AC implements Switchable {
    public void turnOn() {
        System.out.println("AC is ON. Cooling started.");
    }
    public void turnOff() {
        System.out.println("AC is OFF. Cooling stopped.");
    }
}
class Television implements Switchable {
    public void turnOn() {
        System.out.println("TV is ON. Watching television.");
    }
    public void turnOff() {
        System.out.println("TV is OFF.");
    }
}
public class program20 {
    public static void main(String[] args) {
              Switchable[] devices = {
            new Light(),
            new Fan(),
            new AC(),
            new Television()
        };       
        for (Switchable s : devices) {
            s.turnOn();
            s.turnOff();
            System.out.println("----------------");
        }
    }
}

