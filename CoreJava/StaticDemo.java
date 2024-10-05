package CoreJava;

public class StaticDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Cat myCat1 = new Cat();
        Cat myCat2 = new Cat();
        Cat myCat3 = new Cat();
        myCat.age = 5;
        myCat.meow();
        System.out.println(Cat.getCatCount());
        System.out.println(Cat.MAX_LIVES);
    }
}

class Cat {
    public static final int MAX_LIVES = 9;
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;

    public Cat() {
        catCount++;
        livesRemaining = MAX_LIVES;
    }

    public void meow() {
        System.out.println("Cat meows...");
    }

    public static int getCatCount() {
        return catCount;
    }
}
