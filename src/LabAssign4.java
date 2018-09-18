import java.util.Scanner;

/**
* @author Andy Em
* 9-18-18
* Section AC01 
* Lab Assign 4
*/
public class LabAssign4 {

    // User Integer Validation
    public static int getIntegerInput(Scanner scan, String msg) {
        int userInputNum = 0;
        boolean checkInput;
        
        do {
            System.out.print(msg);
            //Check if its an Integer
            if(!scan.hasNextInt()) {
                checkInput = true;
                scan.next();
            } else {
                checkInput = false;
                userInputNum = scan.nextInt();
            }
            
        }while(checkInput);
        
        return userInputNum;
    }
    
    // Get Operation
    public static int getOperation(Scanner scan) {
        int operator = 0;
        boolean checkInputOperator;

        do {
            System.out.print("Enter operation choice \n" + 
                                 "1 - addition\n"       +
                                 "2 - subtraction\n"    +
                                 "3 - multiplication\n" +
                                 "4 - division\n"       +
                                 "5 - modulus\n"        +
                                 "Choice: --> ");
            // Check if input is an int
            if(!scan.hasNextInt()) {
                checkInputOperator = true; 
                scan.next();
            } else {
                checkInputOperator = false;
                operator = scan.nextInt();
            }
        } while(checkInputOperator);
        
        return operator;
    }

    public static void calculate_Display(int num1, int num2, int opr) {
            
            int sum, 
                remainder, 
                diff, 
                product;
            double quotient;
        
            switch(opr) {
                // Addition
                    case 1:
                        sum = num1 + num2;
                        System.out.println("\nSum is " + sum);
                        break;
                // Subtraction
                    case 2:
                        diff = num1 - num2;
                        System.out.println("\nDifference is " + diff);
                        break;
                // Multiplication
                    case 3:
                        product = num1 * num2;
                        System.out.println("\nProduct is " + product);
                        break;
                // Division
                    case 4:
                        if(num2 == 0) {
                            System.out.println("\nDivision by zero is not allowed.");
                        } else {
                            quotient = (double)num1 / (double)num2;
                            System.out.printf("\nQuotient is %.4f\n", quotient);
                        }
                        break;
                // Modulus
                    case 5:
                        if(num2 == 0) {
                            System.out.println("\nRemainder division by zero is not allowed.");
                        } else {
                            remainder = num1 % num2;
                            System.out.println("\nRemainder is " + remainder);
                        }
                        break;
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int num1, num2;     
        int opr;
        String msgOne = "Enter first integer: -> ";
        String msgTwo = "Enter second integer: -> ";
        String repeat = "YES";
        String inputRepeat;
        Scanner scan = new Scanner(System.in);
        
        do{
                num1 = getIntegerInput(scan, msgOne);
                num2 = getIntegerInput(scan, msgTwo);
                opr = getOperation(scan);
                calculate_Display(num1, num2, opr);
            
                scan.nextLine();
            
                // Prompt to REPEAT
                System.out.print("Enter \"YES\" to repeat -> ");
                inputRepeat = scan.nextLine();
        } while(inputRepeat.equalsIgnoreCase(repeat));
        
    }
    
}