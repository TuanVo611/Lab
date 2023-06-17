package lab_07_2;

import java.util.List;

public class AnimalController {
    public Animal getMaxSpeed(List<Animal> animalList) {
        int maxSpeed = 0;
        int i = 0;
        for (int index = 0; index < animalList.size(); index++) {
            if (maxSpeed < animalList.get(index).getSpeed()) {
                maxSpeed = animalList.get(index).getSpeed();
                index = i;
            }
        }
        return animalList.get(i);
    }
}
