package hw321112020;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainHw3App {
    static Random random;
    static Scanner scanner;


    public static void main(String[] args) {
        random = new Random();
        scanner = new Scanner(System.in);
        int userAnswer;
        int userAnswertoReplay;
        int truAnswer;
        int counter=3;
        int newGame = 1;


        do {
            truAnswer = random.nextInt(10);

            for (int i = 0; i < counter ; i++) {

                System.out.println("Угадайте загаданное число в диапозоне о \"0\" до \"10\": У вас осталось " +
                        (counter - i) + " попыток");
                userAnswer = scanner.nextInt();

                if (userAnswer == truAnswer) {
                    System.out.println("Вы угадали");
                    break;
                }
                else if (userAnswer < truAnswer) {
                    System.out.println("Загаданное число больше!");
                } else {
                    System.out.println("Загаданное число меньше");
                }

            }

            System.out.println("Желаете повторить игру? если да наберите \"1\", если нет то любую другую цифру");
            userAnswertoReplay = scanner.nextInt();
            if(userAnswertoReplay ==newGame){
                System.out.println("Игра окончена! Правильный ответ: " + truAnswer);
            }
        }
        while (userAnswertoReplay == newGame);
        System.out.println("Игра окончена! Правильный ответ: "+ truAnswer);


        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Отгадайте слово которое загадал компьютер из массива слов\n" + Arrays.toString(words));

        int count = random.nextInt(words.length - 1);
        String truAnswerWord = words[count];
        String userAnswerWord;


        userAnswerWord = scanner.nextLine();
        char [] testTruAnswerArr = truAnswerWord.toCharArray();


        do {

            System.out.println("Введите ответ: ");
            userAnswerWord=scanner.nextLine();
            char [] testUserAnswerArr = userAnswerWord.toCharArray();
            testUserAnswerArr = userAnswerWord.toCharArray();


            String testWord = "###############";
            char [] testWordArr = testWord.toCharArray();

            if (Arrays.equals(testUserAnswerArr,testTruAnswerArr)){
                System.out.println("Поздравляю, вы угадали");
                break;
            } else {
                for (int i = 0; i < truAnswerWord.length() && i< userAnswerWord.length(); i++) {
                    if( userAnswerWord.charAt(i) == truAnswerWord.charAt(i)) {
                        testWordArr[i] = userAnswerWord.charAt(i);
                    }
                }System.out.println(Arrays.toString(testWordArr));
            }

        }while(userAnswerWord.equals(truAnswerWord)== false);

    }
}


