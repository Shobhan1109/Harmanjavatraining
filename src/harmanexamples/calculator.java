package harmanexamples;

import java.util.Scanner;

public class calculator extends Parentcalculator{

    public static void main(String[] args) {
        calculator obj=new calculator();

        Scanner input = new Scanner(System.in);
        int n1,n2,result1, result2, result3, result4;
        System.out.println("enter the n1:");
        n1=input.nextInt();
        System.out.println("enter the n2:");
        n2=input.nextInt();
        result1= obj.AddOperation(n1,n2);
        result2= obj.DivOperation(n1,n2);
        result3= obj.MulOperation(n1,n2);
        result4= obj.SubOperation(n1,n2);
        System.out.println("Addition: "+result1);
        System.out.println("Multiplication: "+result2);
        System.out.println("Division: "+result3);
        System.out.println("Subtraction: "+result4);
    }
}
