package Calculator;

import java.util.Scanner;

public class CalculatorCLI {
    public static void main(String[] args) {
        System.out.println(CalculatorFunctions.add(5, 5));
        System.out.println(CalculatorFunctions.subtract(5, 5));
        System.out.println(CalculatorFunctions.multiply(5, 5));
        System.out.println(CalculatorFunctions.divide(5, 5));

        System.out.println("WELCOME TO CALCULATOR \n Enter an equation or 'help' for more options");
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("Enter formula: ");
            String equation = s.nextLine();
        
            if (equation.equals("help")){
                String helpMessage="Format: <number> <operator> <number> \nExit Command: Press Enter or type 'exit'";
                helpMessage.toString();
                System.out.println(helpMessage);
                continue;
            }
            else if (equation.equals("") || equation.equals("exit")){
                break;
            }
            else{
                String[] arr = equation.split(" ");
                float x = Float.parseFloat(arr[0]);
                String operator = arr[1];
                float y = Float.parseFloat(arr[2]);
                if (operator.equals("+")){
                    System.out.println("Answer: " + CalculatorFunctions.add(x, y));
                }
                else if (operator.equals("-")){
                    System.out.println("Answer: " + CalculatorFunctions.subtract(x, y));
                }
                else if (operator.equals("*")){
                    System.out.println("Answer: " + CalculatorFunctions.multiply(x, y));
                }
                else {
                    System.out.println("Answer: " + CalculatorFunctions.divide(x, y));
                }
            }
        }
        s.close();
    }
}
