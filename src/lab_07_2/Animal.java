package lab_07_2;

import java.security.SecureRandom;

public class Animal {
    private int speed;

    public Animal() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                '}';
    }
}
