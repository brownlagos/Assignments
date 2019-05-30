//DateTest.java

        import java.util.Scanner;

        public class DateTest{

            public static void main(String[] args){

                   

                    Scanner input = new Scanner(System.in);

                    System.out.println("Enter day: ");
                    int day2 = input.nextInt();
                    
                    System.out.println("Enter month: ");
                    int month2 = input.nextInt();

                    System.out.println("Enter year: ");
                    int year2 = input.nextInt();
                     Date calender = new Date(day2,month2,year2);

                     System.out.print(calender.displayDate());
            }
        }