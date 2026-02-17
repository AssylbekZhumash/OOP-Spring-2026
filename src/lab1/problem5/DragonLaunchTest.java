package lab1.problem5;

public class DragonLaunchTest {
    public static void main(String[] args) {
        System.out.println("=== DRAGON LAUNCH SIMULATION ===\n");

        System.out.println("Test 1: BBGG");
        DragonLaunch launch1 = new DragonLaunch();
        launch1.kidnap(new Person(Gender.BOY));
        launch1.kidnap(new Person(Gender.BOY));
        launch1.kidnap(new Person(Gender.GIRL));
        launch1.kidnap(new Person(Gender.GIRL));
        System.out.print("Initial line: ");
        launch1.printLine();
        System.out.println("Will dragon eat? " + (launch1.willDragonEatOrNot() ? "YES" : "NO"));
        System.out.println();

        System.out.println("Test 2: GBGB");
        DragonLaunch launch2 = new DragonLaunch();
        launch2.kidnap(new Person(Gender.GIRL));
        launch2.kidnap(new Person(Gender.BOY));
        launch2.kidnap(new Person(Gender.GIRL));
        launch2.kidnap(new Person(Gender.BOY));
        System.out.print("Initial line: ");
        launch2.printLine();
        System.out.println("Will dragon eat? " + (launch2.willDragonEatOrNot() ? "YES" : "NO"));
        System.out.println();

        System.out.println("Test 3: BG");
        DragonLaunch launch3 = new DragonLaunch();
        launch3.kidnap(new Person(Gender.BOY));
        launch3.kidnap(new Person(Gender.GIRL));
        System.out.print("Initial line: ");
        launch3.printLine();
        System.out.println("Will dragon eat? " + (launch3.willDragonEatOrNot() ? "YES" : "NO"));
        System.out.println();

        System.out.println("Test 4: BGBG");
        DragonLaunch launch4 = new DragonLaunch();
        launch4.kidnap(new Person(Gender.BOY));
        launch4.kidnap(new Person(Gender.GIRL));
        launch4.kidnap(new Person(Gender.BOY));
        launch4.kidnap(new Person(Gender.GIRL));
        System.out.print("Initial line: ");
        launch4.printLine();
        System.out.println("Will dragon eat? " + (launch4.willDragonEatOrNot() ? "YES" : "NO"));
        System.out.println();

        System.out.println("Test 5: GBBG");
        DragonLaunch launch5 = new DragonLaunch();
        launch5.kidnap(new Person(Gender.GIRL));
        launch5.kidnap(new Person(Gender.BOY));
        launch5.kidnap(new Person(Gender.BOY));
        launch5.kidnap(new Person(Gender.GIRL));
        System.out.print("Initial line: ");
        launch5.printLine();
        System.out.println("Will dragon eat? " + (launch5.willDragonEatOrNot() ? "YES" : "NO"));
        System.out.println();
    }
}