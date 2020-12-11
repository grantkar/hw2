package hw6Lesson6;

import hw6Lesson6.animals.*;

public class Main {

    public static void main(String[] args) {
        Dog dogPirat = new Dog("Пират");
        Dog dogBobik = new Dog("Бобик");
        Cat catBarsik = new Cat("Barsik");
        Cat catMyrzik = new Cat("Myrzik");

     dogBobik.run(100);
     dogPirat.run(550);
     catBarsik.run(100);
     catMyrzik.run(210);
     dogBobik.swim(5);
     dogPirat.swim(11);
     catBarsik.swim(5);

       Animals.getCount();
       Cat.getCountCat();
       Dog.getCoutDog();

    }
}
