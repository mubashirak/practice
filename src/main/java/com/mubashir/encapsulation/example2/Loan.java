package com.mubashir.encapsulation.example2;

class Loan{
    private int duration;  //private variables examples of encapsulation
    private String loan;
    private String borrower;
    private String salary;
   
    //public constructor can break encapsulation instead use factory method
    private Loan(int duration, String loan, String borrower, String salary){
        this.duration = duration;
        this.loan = loan;
        this.borrower = borrower;
        this.salary = salary;
    }
   
    //no argument constructor omitted here
    
   // create loan can encapsulate loan creation logic
  
   
}


