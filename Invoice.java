//Invoice.java

        public class Invoice{

            private String partNumber;
            private String partDescription;
            private int quantity;
            private double pricePerItem;
            private double invoiceAmount;

            public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){

                this.partNumber = partNumber;
                this.partDescription = partDescription;
                this.quantity = quantity;
                this.pricePerItem = pricePerItem;
            } 
                    public void  setInvoiceAmount(double invoiceAmount){
                        invoiceAmount = quantity * pricePerItem;
                    }
                    public double getInvoiceAmount(){
                        return invoiceAmount;
                    }

                        public void setPartNumber(String partNumber){
                            this.partNumber = partNumber;
                    }
                        public String getPartNumber(){
                            return partNumber;
                    }
                        public void setPartDescription(String partDescription){
                            this.partDescription = partDescription;
                    }
                         public String getPartDescription(){
                            return partDescription;
                    }
                        public void setQuantity(int quantity){
                            this.quantity = quantity;
                    }
                        public int getQuantity(){
                            return quantity;
                    }
                        public void setPricePerItem(double pricePerItem ){
                            this.pricePerItem = pricePerItem;
                    }
                        public double getPricePerItem(){
                            return pricePerItem;
                    }
        }