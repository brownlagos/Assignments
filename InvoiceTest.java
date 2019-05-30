//InvoiceTest.java

    import java.util.Scanner;

        public class InvoiceTest{

            
            public static void main(String[] args){

                Invoice myInvoice = new Invoice("partNumber", "partDescription",quantity,pricePerItem);

                Scanner input = new Scanner(System.in);

                System.out.println("Enter PartNumber: ");
                String partNumber = input.nextLine();

                System.out.println("Enter PartDescription: ");
                String partDescription = input.nextLine();

                System.out.println("Enter Quantity: ");
                int quantity = input.nextInt();

                System.out.println("Enter PricePerItem: ");
                double PricePerItem = input.nextDouble();

                System.out.println("Enter Invoice Amount: ");
                double invoiceAmount = input.nextDouble();

                myInvoice.setPartNumber(partNumber);
                
            }
        }