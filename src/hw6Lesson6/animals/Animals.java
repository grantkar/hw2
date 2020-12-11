package hw6Lesson6.animals;

public class Animals {
      String name;
      static int count;


    public Animals(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        System.out.println("Созданно " + count + " животных");
        return count;
    }

    public void run (int distRun){

        System.out.println(name + " пробежал " + distRun +" м.");
    }

    public void swim (int distSwim){

        System.out.println(name + " проплыл " + distSwim + " м.");
    }
}
