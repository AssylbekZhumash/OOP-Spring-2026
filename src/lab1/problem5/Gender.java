package lab1.problem5;

public enum Gender {
    BOY, GIRL;

    @Override
    public String toString() {
        return this == BOY ? "B" : "G";
    }
}