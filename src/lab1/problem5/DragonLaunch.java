package lab1.problem5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnappedPeople;

    public DragonLaunch() {
        kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person p) {
        kidnappedPeople.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boyCount = 0;

        for (Person p : kidnappedPeople) {
            if (p.isBoy()) {
                boyCount++;
            } else {
                if (boyCount > 0) {
                    boyCount--;
                }
            }
        }

        return boyCount > 0;
    }

    public void printLine() {
        for (Person p : kidnappedPeople) {
            System.out.print(p);
        }
        System.out.println();
    }

    public void clear() {
        kidnappedPeople.clear();
    }
}