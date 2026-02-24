package pr3.animal.app;
import pr3.animal.model.*;
import java.util.*;

public class MainApp {
    public static void main(String[] args){
        Animal dog1=new Dog("Rex",5,"Labrador");
        Dog dog2 = new Dog("Buddy",5,"Beagle");

        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);

        for(Animal animal: animals){
            animal.getInfo();
            animal.makeSound();
            animal.eat();
            animal.eat("meat");
            System.out.println("--------------");
        }
    }
}
