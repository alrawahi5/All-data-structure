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
            //System.out.println(letters[i] + " = " + count[i]); // letter == number

        }

        //test
        //System.out.println(Arrays.toString(letters));
        //System.out.println(Arrays.toString(count));
            System.out.println("Enter the string that you want to evaluate: ");
            String evaluatedString = sc.nextLine();
        System.out.print("[");
            for (int j = 0; j<evaluatedString.length(); j++){
                if (Character.isAlphabetic(evaluatedString.charAt(j)) && evaluatedString.charAt(j) == letters[Character.toLowerCase(evaluatedString.charAt(j)) - 'a']) {
                    System.out.print(count[Character.toLowerCase(evaluatedString.charAt(j)) - 'a'] + ",");
                }
            }
        System.out.println("]");
    }
}
