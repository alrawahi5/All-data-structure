import java.util.Arrays;
import java.util.Scanner;

public class PackageMeasurementConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        int [] count = new int[26];
        int i = 0;
        char [] letters = new char[26];
        int countSupport = 1;

        for (i  = 0; i < alphabets.length(); i++){
            letters[i] = alphabets.charAt(i);
            count[i] = countSupport++;
            System.out.println(letters[i] + " = " + count[i]);
        }

            System.out.println("Enter the string that you want to evaluate: ");
            String evaluatedString = sc.nextLine();
            for (int j = 0; j<evaluatedString.length()-1; j++){
                if (letters[j] == letters[count[j]]){
                    System.out.println("[" + count + "]");
                }
                System.out.println("[" + count + "]");
            }



    }
}
