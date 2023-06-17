package lab_07_2;

import java.security.SecureRandom;

public class Dog extends Animal {

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(50);
    }
}
