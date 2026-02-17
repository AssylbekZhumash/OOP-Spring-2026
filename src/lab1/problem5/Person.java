package lab1.problem5;

public class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isBoy() {
        return gender == Gender.BOY;
    }

    public boolean isGirl() {
        return gender == Gender.GIRL;
    }

    @Override
    public String toString() {
        return gender.toString();
    }
}