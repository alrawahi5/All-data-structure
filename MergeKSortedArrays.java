import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class MergeKSortedArrays {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> allArrays = new ArrayList<>();
        System.out.println("How many arrys do you have? Max 3");
        Integer arraysCount = sc.nextInt();
        for (int i = 0; i<1; i++) {
            if (arraysCount == 1){
                System.out.println("what is the size of you first arry? ");
                Integer firstArrSize = sc.nextInt();
                Integer arra[] = new Integer[firstArrSize];
                System.out.println("enter your elements: ");
                for (int j = 0; j < firstArrSize; j++){
                    Integer element1 = sc.nextInt();
                    arra[j] = element1;
                }
                System.out.println(Arrays.toString(arra));
                allArrays.addAll(Arrays.asList(arra));
            }
            if (arraysCount == 2){
                System.out.println("what is the size of you first arry? ");
                Integer firstArrSize = sc.nextInt();
                Integer arra[] = new Integer[firstArrSize];
                System.out.println("enter your elements: ");
                for (int j = 0; j < firstArrSize; j++){
                    Integer element1 = sc.nextInt();
                    arra[j] = element1;
                }
                System.out.println("what is the size of you second arry? ");
                Integer secondArrSize = sc.nextInt();
                Integer arrb[] = new Integer[secondArrSize];
                System.out.println("enter your elements: ");
                for (int j = 0; j < secondArrSize; j++){
                    Integer element1 = sc.nextInt();
                    arrb[j] = element1;
                }
                System.out.println("Your first Array has: " + Arrays.toString(arra));
                System.out.println("Your second Array has: " +Arrays.toString(arrb));

                allArrays.addAll(Arrays.asList(arra));
                allArrays.addAll(Arrays.asList(arrb));
            }
            if (arraysCount == 3){
                System.out.println("what is the size of you first arry? ");
                Integer firstArrSize = sc.nextInt();
                Integer arra[] = new Integer[firstArrSize];
                System.out.println("enter your elements: ");
                for (int j = 0; j < firstArrSize; j++){
                    Integer element1 = sc.nextInt();
                    arra[j] = element1;
                }
                System.out.println("what is the size of you second arry? ");
                Integer secondArrSize = sc.nextInt();
                Integer arrb[] = new Integer[secondArrSize];
                System.out.println("enter your elements: ");
                for (int j = 0; j < secondArrSize; j++){
                    Integer element1 = sc.nextInt();
                    arrb[j] = element1;
                }
                System.out.println("what is the size of you third arry? ");
                Integer thirdArrSize = sc.nextInt();
                Integer arrc[] = new Integer[thirdArrSize];
                System.out.println("enter your elements: ");
                for (int j = 0; j < thirdArrSize; j++){
                    Integer element1 = sc.nextInt();
                    arrc[j] = element1;
                }
                System.out.println("Your first Array has: " + Arrays.toString(arra));
                System.out.println("Your second Array has: " +Arrays.toString(arrb));
                System.out.println("Your third Array has: " +Arrays.toString(arrc));

                allArrays.addAll(Arrays.asList(arra));
                allArrays.addAll(Arrays.asList(arrb));
                allArrays.addAll(Arrays.asList(arrc));
            }
        }
        System.out.println("Your compined Arrays has: " + allArrays);
        Collections.sort(allArrays);
        System.out.println("Your sorted compined Arrays has: " + allArrays);
        sc.close();
    }
}
