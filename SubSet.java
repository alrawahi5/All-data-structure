import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SubSet {
        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> allArrays = new ArrayList<>();
            //ArrayList<ArrayList<Integer>> allArrays = new ArrayList<>();
            Integer arraysCount = 1;
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
                    //System.out.println(Arrays.toString(arra)); // [1, 2, 3]
                    allArrays.addAll(Arrays.asList(arra));

                    System.out.println("SubArrya for " +allArrays + " are: ");
                    System.out.println(" ");
                    for (int a = 0; a < arra.length; a++)
                        for (int j = a; j < arra.length; j++) {
                            for (int k = i; k <=j; k++)
                                System.out.print(arra[k] + " ");
                            System.out.println("");
                        }
                        }
                }

            }
            //System.out.println("Your compined Arrays has: " + allArrays);  //Your compined Arrays has: [1, 2, 3]
            //Collections.sort(allArrays);
            //System.out.println("Your sorted compined Arrays has: " + allArrays); // Your sorted compined Arrays has: [1, 2, 3]

            //sc.close();
        }


