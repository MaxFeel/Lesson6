public class Cat extends Animal{

    private static int countCreateCats = 0;

    public Cat(String _name) {
        super(_name);
        countCreateCats++;
    }

    @Override
    public void run(int runMetre) {
        if(runMetre <= 300) {
            super.run(runMetre);
        } else {
            System.out.println("Кошка не может пробежать больше 300 метров");
        }
    }

    @Override
    public void swim(int swimMetre) {
        System.out.println("Кошки не умеют плавать");
    }

    public static void getCountCreate(){
        System.out.println("Количество созданных котиков: " + countCreateCats);
    }
}
