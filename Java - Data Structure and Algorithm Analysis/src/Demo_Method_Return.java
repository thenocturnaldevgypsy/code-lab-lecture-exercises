/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo # 8 : Method using a specific returnValueType and the 'return' statement 
*/

import java.util.Scanner;

public class Demo_Method_Return {

	public Demo_Method_Return() {

        Scanner x = new Scanner (System.in);
        int num1, num2, result;
        
        System.out.println("Enter 2 integer numbers");
        num1 = x.nextInt();
        num2 = x.nextInt();
        result = AddNum(num1, num2);
        System.out.print(result);

    }
    
    public static int AddNum (int num1, int num2) {

        int added = num1 + num2;
        return added;

    }
}