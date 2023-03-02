/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigos;

 
import java.util.Scanner;
 
/**
 *
 * @author kspg2
 */
public class a4 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int primero = sc.nextInt();
        if (primero == 0) {
            System.out.println("NO");
        } else if (primero % 2 == 0 && primero !=2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
 
}
