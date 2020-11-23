import java.util.Arrays;
import java.util.Random;

public class MainHwApp {

    static Random random = new Random();

    private static boolean compareSum(int [] array){
        boolean result = false;
        int sumGeneral = 0;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length; i++) {
            sumGeneral = sumGeneral + array[i];
        }
        for (int i = 0; i <array.length ; i++) {
            sumLeft = sumLeft + array[i];
            sumRight = sumGeneral - sumLeft;
            if (sumRight == sumLeft){
                result = true;
            }
        }
        return (result);
    }

    public static int[] arrSetShift (int [] array, int n){

        int Buf;
        int Buf2;

        if (n >= 0){
            for (int i = 0; i < n; i++) {
                Buf = array[0];
                array[0] = array[array.length - 1];
                for (int j = 0; j < array.length - 1; j++) {
                    Buf2 = array[j + 1];
                    array[j + 1] = Buf;
                    Buf = Buf2;
                }
            }
        } else {
            for (int i = 0; i > n ; i--) {
                Buf = array[0];
                array[0] = array[i+1];
                for (int j = array.length-1; j >=0; j--) {
                    Buf2 = array[j];
                    array[j]=Buf;
                    Buf=Buf2;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {


        int [] arr = {1,1,0,0,1,1,0,1,0};
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else
                arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();


        int [] arr2  = new int[7];
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println();


        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++){
            if (arr3[i] < 6){
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println();


        int [][] arr4 = new int[5][5];
        int counter = 0;
        for (int i = 0; i < arr4.length; i++){
            for (int j = 0; j < arr4.length; j++){
                arr4[i][j] = counter;
                if (i == j || i + j==4){
                    arr4[i][j] = 1;
                }
                System.out.printf("%-4d",arr4[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        int [] arr5 = new int[5];
        int arrMin = 100;
        int arrMax = 0;
        for (int i = 0; i < arr5.length ; i++) {
            arr5[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr5));
        for (int i = 0; i < arr5.length; i++) {
            if (arrMin > arr5[i]) {
                arrMin = arr5[i];
            }
            if (arrMax < arr5[i]){
                arrMax = arr5[i];
            }
        }
        System.out.println("Минимальный элемент массива arr5 = " + arrMin);
        System.out.println("Максимальный элемент массива arr5 = " + arrMax);
        System.out.println();


        int[] arr6 = new int[4];
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = random.nextInt(5);
        }
        System.out.println(Arrays.toString(arr6));

        System.out.println();

        System.out.println(compareSum(arr6));
        System.out.println();

        int [] arrSet = {1,2,3,4,5};
        arrSetShift(arrSet, 2);
        System.out.println(Arrays.toString(arrSet));

    }
}

