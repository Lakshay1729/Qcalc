package com.crio.qcalc;

public class StandardCalculator {
    protected double result;
    public void add(int a ,int b){

        long temp = (long) a + (long) b;

    if (temp > Integer.MAX_VALUE)

        throw new ArithmeticException();


    result = a + b;
    }
    public void subtract(int a ,int b){
        long temp=(long)a-(long)b;
        if(temp<Integer.MIN_VALUE){
            throw new ArithmeticException();
        }
        result= a-b;
    }

    public void multiply(int a ,int b)
    {
        long temp = (long) a + (long) b;

        if (temp > Integer.MAX_VALUE)
    
            throw new ArithmeticException();
    
        result=a*b;
    }
    public void divide(int a,int b){
        double ad=(double)a;
        double bd=(double)b;
        result=ad/bd;
    }
    

   public double getResult(){
       return result;
   }
   public void setResult(double result){
       if(result!=0){
           return ;
       }
       this.result=result;
   } 
}
