package hw6Lesson6.animals;

 public class Cat extends Animals{
    static int countCat;
   public Cat(String name){
       super(name);
       countCat++;
   }

     public static int getCountCat() {
         System.out.println("Созданно " + countCat + " котов");
         return countCat;
     }

     @Override
     public void run(int distRun) {
         if (distRun>200){
             System.out.println(name + " может бежать на максимальную дистанцию = 200м");
             return;
         } else {
             super.run(distRun);
         }
     }

     @Override
     public void swim(int distSwim) {
         if (distSwim != 0){
             System.out.println(name + " не плавает, он КОТ!!");
         }else
         super.swim(distSwim);
     }
 }
