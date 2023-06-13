package lab_07_2;

import lab_07_2.Animal;
import lab_07_2.AnimalController;

import java.util.ArrayList;
import java.util.List;

public class Lab_07_02 {
    public static void main(String[] args) {
        Animal horse = new Animal();
        Animal tiger = new Animal();
        Animal dog = new Animal();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);

        AnimalController animalController = new AnimalController();
        Animal winnerAnimal = animalController.getMaxSpeed(animalList);
        System.out.println(winnerAnimal.getSpeed());
        String winnerName = winnerAnimal.getClass().getSimpleName();
        int winnerSpeed = winnerAnimal.getSpeed();
        System.out.println("Winner is " + winnerName + " with speed " + winnerSpeed);
    }
}
