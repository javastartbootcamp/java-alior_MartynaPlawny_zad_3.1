package pl.javastart.task;

public class Televisor {
    private boolean turnedOn;

    public Televisor(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void turnOn() {
        turnedOn = true;
    }

    public void turnOff() {
        turnedOn = false;
    }

    public void showStatus() {
        System.out.println("Czy telewizor jest włączony? " + turnedOn);
    }
}
