package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numberable;
import java.util.Scanner;


public class MyCalculator implements Numberable {

    public static void main(String[] args) {

        char [] symbol = {'/', '*', '+', '-'};

        System.out.println("Введіть будь ласка перше число, дію та друге число");

        Scanner scan1 = new Scanner(System.in);
        String scan = scan1.nextLine();

        int lengthScan = scan.length();

        MyCalculator myCalculator = new MyCalculator();

    for(char i: symbol){

        int  symb = scan.indexOf(i);

if(symb>0)

{
 double numberA = Double.parseDouble(scan.substring(0,symb));
double numberB = Double.parseDouble(scan.substring(symb+1,lengthScan-1));

    switch (i){

        case '/' :
            System.out.println(myCalculator.devide(numberA, numberB));break;
            case '*' :
                System.out.println(myCalculator.multiple(numberA, numberB)); ; break;
            case '+' :
                System.out.println(myCalculator.plus(numberA, numberB)); ; break;
            case '-' :
                System.out.println(myCalculator.minus(numberA, numberB)); ; break;

        }

  }
    }



    }
}
