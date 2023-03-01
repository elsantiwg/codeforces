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
public class a231 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, acum = 0, acum2 = 0;
        int ejercicios = sc.nextInt();
        for (int i = 0; i < ejercicios; i++) {
            for (int j = 0; j < 3; j++) {
                n = sc.nextInt();
                acum += n;
            }
            if (acum > 1) {
                acum2++;
            }
            acum = 0;
        }
        System.out.println(acum2);
    }
}
