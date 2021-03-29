public class Animal {
    String name;
    private static int countCreate = 0;

    public Animal(String _name){
        this.name = _name;
        countCreate++;
    }

    public void run(int runMetre){
        System.out.printf("%S пробежал(а) %d метров",this.name,runMetre);
        System.out.println();
    }

    public void swim(int swimMetre){
        System.out.printf("%S проплыл(а) %d метров",this.name,swimMetre);
        System.out.println();
    }

    public static void getCountCreate(){
        System.out.println("Количество созданных животных: " + countCreate);
    }

}
