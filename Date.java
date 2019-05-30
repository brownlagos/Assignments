//Date.java

    public class Date{

       private int day;
       private int month;
       private int year;

            public Date(int day,int month, int year){

                if(day > 0 && day <= 31)

                    this.day = day;

                if(month > 0 && month <= 12)
                    this.month = month;

                if(year >= 1900 && year <= 2900)
                    this.year = year;
                

           }

                public void setDay(int day){
                    this.day = day;
                }

                public int getDay(){
                    return day;
                }

                public void setMonth(int month){
                    this.month = month;
                }

                public int getMonth(){
                    return month;
                }

                public void setYear(int year){
                    this.year = year;
                }
                public int getYear() {
                    return year;
                }

                    public String displayDate(){
                        return day + "/" + month + "/" + year + "!";
                        //return date;
                    }
                     

    }