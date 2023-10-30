/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

/**
 *
 * @author laapa
 */
public class Fibonacci {

    public static void main(String[] args) {
        int f0 = 0, f1 = 1, tmp;
        do{
          System.out.println(f0);
          tmp = f0 + f1;
          f0 = f1;
          f1 = tmp;
        } while (f0 < 1000);
    }
}
