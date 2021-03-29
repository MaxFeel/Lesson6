public class Dog extends Animal{

    private static int countCreateDogs = 0;

    public Dog(String _name) {
        super(_name);
        countCreateDogs++;
    }

    @Override
    public void run(int runMetre) {
        if(runMetre <= 500) {
            super.run(runMetre);
        } else {
            System.out.println("Собака не может пробежать больше 500 метров");
        }
    }

    @Override
    public void swim(int swimMetre) {
        if(swimMetre <= 10) {
            super.swim(swimMetre);
        } else {
            System.out.println("Собака не может проплыть больше 10 метров");
        }
    }

    public static void getCountCreate(){
        System.out.println("Количество созданных собак: " + countCreateDogs);
    }

}
