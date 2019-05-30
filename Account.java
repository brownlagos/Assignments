 //Account.java

        public class Account{

            private String name;
            private double balance;

              public Account(String name, double balance){
                     this.name = name;

                     if(balance > 0.0)
                     this.balance = balance;
              }
                     public void withdraw(double withdrawAmount){
                            if(withdrawAmount < balance)
                             balance = balance - withdrawAmount;

                             if(withdrawAmount > balance){
                            System.out.println("withdrawal2 Amount exceeded balance");
                             }

              }

                     public double getBalance(){
                            return balance;
              }
                     
                     public void setName(String name){
                            this.name = name;
            }
                     public String getName(){
                            return name;
            }
               
        }