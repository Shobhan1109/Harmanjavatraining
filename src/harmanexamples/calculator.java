package harmanexamples;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Addition addcalc=new Addition();
        Multiplication mulcalc=new Multiplication();
        Division divcalc=new Division();
        Subtraction subcalc=new Subtraction();

        Scanner input = new Scanner(System.in);
        int n1,n2,result1, result2, result3, result4;
        System.out.println("enter the n1:");
        n1=input.nextInt();
        System.out.println("enter the n2:");
        n2=input.nextInt();
        result1= addcalc.AdditionOperation(n1,n2);
        result2= mulcalc.MultiplicationOperation(n1,n2);
        result3= divcalc.DivisionOperation(n1,n2);
        result4= subcalc.SubtractionOperation(n1,n2);
        System.out.println("Addition: "+result1);
        System.out.println("Multiplication: "+result2);
        System.out.println("Division: "+result3);
        System.out.println("Subtraction: "+result4);
    }
}
