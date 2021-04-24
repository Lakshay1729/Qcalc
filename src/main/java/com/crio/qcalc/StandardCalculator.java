package com.crio.qcalc;
public class StandardCalculator {
    private int result;
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
   public int getResult(){
       return result;
   }
   public void setResult(int result){
       if(result!=0){
           return ;
       }
       this.result=result;
   }
}
