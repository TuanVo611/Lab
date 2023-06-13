package lab_07_2;

import java.security.SecureRandom;

public class Tiger extends Animal{

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(100);
    }
}
