package edu.handong.csee.java.hw2;

/**
 *     This is the MathCalculator class
 *     containing all the calculating methods
 *     ex: max, min, abs, sum, etc.
*/
public class MathCalculator {
    private String name;

    /**
    setName method
    @param newname is the parameter;
    it changeds the name of the calculator
     */
    public void setName(String newname){
        this.name = newname;
    }

    /**
    getName method
    @return the name of the calculator
     */
    public String getName(){
        return(name);
    }

    /**
    getMax method
    @param num1 is the parameter;
    @param num2 is the parameter;
    @return the larger number between num1 and num2;
     */
    public int getMax(int num1, int num2){
        if(num1 > num2) return num1;
        else return(num2);
    }

    /**
    getMin method
    @param num1 is the parameter;
    @param num2 is the parameter;
    @return the smaller number between num1 and num2;
     */
    public int getMin(int num1, int num2){
        /**returns smaller number of two numbers */
        if(num1 < num2) return num1;
        else return(num2);
    }

    /**
    getAbs method
    @param num is the parameter;
    @return the the absolute number of the num;
     */
    public int getAbs(int num){
        /**returns absolute value of the numbers */
        if(num < 0) num = num * -1;
        return(num);
    }

    /**
    getSum method
    @param num1 is the parameter;
    @param num2 is the parameter;
    @return the sum of num1 and num2;
     */
    public int getSum(int num1, int num2){
        /**returns sum of two numbers */
        int result = num1 + num2;
        return(result);
    }

    /**
    getDiff method
    @param num1 is the parameter;
    @param num2 is the parameter;
    @return the difference of num1 and num2;
     */
    public int getDiff(int num1, int num2){
        /**returns difference of two numbers */
        int result = num1 - num2;
        return(result);
    }
    
    /**
    getProduct method
    @param num1 is the parameter;
    @param num2 is the parameter;
    @return the multiplecation of num1 and num2;
     */
    public int getProduct(int num1, int num2){
        /**returns multiples of two numbers */
        int result = num1 * num2;
        return(result);
    }

    /**
    getQuotient method
    @param num1 is the parameter;
    @param num2 is the parameter;
    @return the division of num1 and num2 (without remainder);
     */
    public int getQuotient(int num1, int num2){
        /**returns quotient/devision of two numbers */
        int result = num1/num2;
        return(result);
    }

    /**
    getRemainder method
    @param num1 is the parameter;
    @param num2 is the parameter;
    @return the remainder of division between num1 and num2;
     */
    public int getRemainder(int num1, int num2){
        /**returns remaninder of two numbers when devision*/
        int result = num1%num2;
        return(result);
    }

    /**
    getPower method
    @param num1 is the parameter;
    @param num2 is the parameter;
    @return the power of num1 out of num2;
     */
    public int getPower(int num1, int num2){
        /**returns power of two numbers */
        int result = 1;
        for(int i = 0; i < num2; i++){
            result *= num1;
        }
        return(result);
    }

    /**
    getFactorial method
    @param num is the parameter;
    @return the factorial of num;
     */
    public int getFactorial(int num){
        /**returns factorial of number that has been input */
        if(num <= 1 ) return(1);
        return(num * getFactorial(num-1));
    }
    
    /**
    getGcd method
    @param num1 is the parameter;
    @param num2 is the parameter;
    @return the Greatest Common Divisor between num1 and num2;
     */
    public int getGcd(int num1, int num2){
        /**returns Greatest Common Divisor of two numbers */
        int result = 0;
        int smaller;

        if(num1 <= num2) smaller = num1;
        else smaller = num2;

        for(int i = 1; i <= smaller; i++){
            if(num1 % i == 0 && num2 % i == 0) result = i;
        }

        return(result);
    }

    /**
    getLcd method
    @param num1 is the parameter;
    @param num2 is the parameter;
    @return the Lowest Common Divisor between num1 and num2;
     */
    public int getLcm(int num1, int num2){
        /**returns Least Common Multiple/Lowest Common Multiple of two numbers */
        int result = (num1 /getGcd(num1, num2))*num2;
        return(result);
    }

    /**
    getSquare method
    @param num is the parameter;
    @return the Square of num;
     */
    public int getSquare(int num){
        /**returns square of the num */
        int result = num*num;
        return(result);
    }
}