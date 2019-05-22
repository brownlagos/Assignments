//CalculatorApp.java
//Author:Brown Uzoukwu, 16th May,2019

    import java.util.Scanner;

    public class CalculatorApp{

        int number1;
        int number2;
        String operator;
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);// creating Scanner class object

            
            System.out.print("Enter First Digit: ");//input first number from user
            int number1 = input.nextInt();

            Scanner  scan = new Scanner(System.in); //create a second Scanner Class object to accept String

            System.out.print("Enter operator: "); //inputs operator
            String operator = scan.next();

            System.out.print("Enter Second Digit: ");//input second number from user
            int number2 = input.nextInt();

            

            if(operator.equals("+")){
                System.out.print("Your answer is: " +(number1 + number2));
            }
                else if(operator.equals("-")){
                System.out.print("Your answer is: " +(number1 - number2));
                
                }
                    else if(operator.equals("*")){
                System.out.print("Your answer is: " +(number1 * number2));   
                  
                    }
                        else if(operator.equals("/")){
                System.out.print("Your answer is: " +(number1 / number2));  
                       
                        }
                            else if(operator.equals("%")){
                System.out.print("Your answer is: " +(number1 % number2));  
                            
                            }
                                else if(operator.equals("^")){
                System.out.print("Your answer is: " +(number1 ^ number2)); 
                    
                     }
        }
    }