import java.util.Scanner;
public class ClimbingStaires2 {
        public static long numOfWaysToClimb(long usrInput) {
            if (usrInput <= 1){
                return 1;
            }
            return usrInput = numOfWaysToClimb(usrInput - 2) + numOfWaysToClimb(usrInput -1);
        }
        public static void main(String [] args) {
            System.out.println();
            System.out.println("Enter the total number in the stairs to figure out the \n" +
                    "number of distinct ways to climb: "); 
            Scanner scInput = new Scanner(System.in);
            long usrInput1 = scInput.nextInt();
            long a = numOfWaysToClimb(usrInput1);
            System.out.println("You get up to " + a + " ways to climb");
        }
    }
