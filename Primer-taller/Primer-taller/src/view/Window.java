/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;
import model.Number;

public class Window {
    Scanner scanner = new Scanner(System.in);
    Number num = new Number();

    //method to read a number from user input
    public void readNumber(){
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        num.setNumber(input);
    }

    //method to display a number
    public void displayNumber(){
        System.out.println("The number is: " + num.getNumber());
    }

}
