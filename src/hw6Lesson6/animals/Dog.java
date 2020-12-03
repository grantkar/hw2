package hw6Lesson6.animals;

 public class Dog extends Animals{
     static int countDog;
     public Dog(String name){
         super(name);
         countDog++;
     }

     public static int getCoutDog() {
         System.out.println("Созданно " + countDog + " собак");
         return countDog;
     }

     @Override
     public void run(int distRun) {
         if (distRun>500){
             System.out.println(name + " может бежать на максимальную дистанцию = 500м");
             return;
         } else
         super.run(distRun);
     }

     @Override
     public void swim(int distSwim) {
         if (distSwim > 10){
             System.out.println(name+" не может плавать больше 10м");
         } else
         super.swim(distSwim);
     }
 }
