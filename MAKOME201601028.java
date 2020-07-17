/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makome201601028;
import java.util.Scanner;

/**
 *
 * @author 201601028
 */
public class MAKOME201601028 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int num1, num2, sum;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Enter num 1: ");
        num1 = x.nextInt();
        
        System.out.println("Enter num 2: ");
        num2 = x.nextInt();
        
        x.close();
        sum = num1 + num2;
        System.out.println("The sum of two numbers is : " +sum);
        
        
        
        
        
        
        
        
        
    }
    
}
