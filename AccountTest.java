//AccountTest.java

        import java.util.Scanner;

            public class AccountTest{

                public static void main(String[] args){

                        Account account1 = new Account("Brown Lagos", 100.00);
                        Account account2 = new Account("Bisi Lagos", 50.00);

                        //Display initial balance of each object

                        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
                        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
                    
                        //Create a scanner input

                        Scanner input = new Scanner(System.in);

                        System.out.println("Enter withdrawal Amount for account1: ");
                        double withdrawAmount = input.nextDouble();
                        System.out.printf("%nsubtracting %2.f from account1 balance %n%n", withdrawAmount);
                        account1.withdraw(withdrawAmount);

                        //Display balances
                        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
                        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

                        System.out.println("Enter withdrawal Amount for account2: ");
                        withdrawAmount = input.nextDouble();
                        System.out.printf("%nsubtracting %2.f from account2 balance %n%n", withdrawAmount);
                        account2.withdraw(withdrawAmount);

                        //Display Balances

                        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
                        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
            }

 }