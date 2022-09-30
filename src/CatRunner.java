public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("boop", 8, 20.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Meowsicles", 2, 9.3);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
