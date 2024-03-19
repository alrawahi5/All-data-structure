import java.util.Scanner;
import java.util.Stack;
public class ExpressionEvaluator {
    public static int evaluate(String expression){
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operatorsAndParentheses = new Stack<>();

        for(int i=0; i<expression.length();i++){
            char easy = expression.charAt(i);
            if (easy == ' ') { ///
                continue;
            }
            if(Character.isDigit(easy)){
                int num = 0;
                while (Character.isDigit(expression.charAt(i))){
                    num = num * 10 + (easy-'0');
                    i++;
                    if(i < expression.length()){
                        easy = expression.charAt(i);
                    }
                    else{
                        break;
                    }
                }
                i--;
                numbers.push(num);
            }
            else if(easy == '('){
                operatorsAndParentheses.push(easy);
            }
            else if(easy == ')'){
                while (!operatorsAndParentheses.isEmpty() && operatorsAndParentheses.peek() != '('){
                    int results = operate(numbers, operatorsAndParentheses);
                    numbers.push(results);
                }
                operatorsAndParentheses.pop();
            }
            else if(isOperator(easy)){
                while (!operatorsAndParentheses.isEmpty() && precedence(easy) <= precedence(operatorsAndParentheses.peek())){
                    int results = operate(numbers, operatorsAndParentheses);
                    numbers.push(results);
                }
                operatorsAndParentheses.push(easy);
            }
        }
        while (!operatorsAndParentheses.isEmpty()){
            int results = operate(numbers, operatorsAndParentheses);
            numbers.push(results);
        }
        return numbers.pop();
    }

    public static int precedence(char easy) {
        if(easy == '+'){
            return 1;
        }
        else if(easy == '-'){
            return 1;
        }
        else if (easy == '*'){
            return 2;
        }
        else if(easy == '/'){
            return 2;
        }
        return 0;
    }

    private static int operate(Stack<Integer> numbers, Stack<Character> operatorsAndParentheses) {
        int i = numbers.pop();
        int j = numbers.pop();
        char operatorsAndParenthesess = operatorsAndParentheses.pop();
        if(operatorsAndParenthesess == '+'){
            return i + j;
        }
        else if(operatorsAndParenthesess == '-'){
            return i - j;
        }
        else if(operatorsAndParenthesess == '*'){
            return i * j;
        }
        else if(operatorsAndParenthesess == '/'){
            if(i == 0){
                System.out.println("Division by 0 cannot be performed! ");
            }
            return i / j;
        }
        return 0;
    }
    private static boolean isOperator(char easy) {
        return (easy == '+' || easy == '-' || easy == '/' || easy == '*');
    }
    public static void main(String[] args) {
        System.out.println("Evaluate your expression here: ");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        int res = evaluate(expression);
        System.out.println(res);
        sc.close();

    }
}