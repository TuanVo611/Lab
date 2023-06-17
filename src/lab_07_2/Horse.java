package lab_07_2;

import java.security.SecureRandom;

public class Horse extends Animal {

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(75);
    }
}
