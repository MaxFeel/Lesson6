public class MainClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Дружок");
        Dog dog1 = new Dog("Пес");
        Dog dog2 = new Dog("Лайка");
        Cat cat = new Cat("Мурка");
        Cat cat1 = new Cat("Люся");

        dog.swim(9);
        dog1.swim(11);
        dog1.run(450);

        cat.swim(10);
        cat1.run(299);
        cat.run(400);

        Animal.getCountCreate();
        Cat.getCountCreate();
        Dog.getCountCreate();
    }
}
