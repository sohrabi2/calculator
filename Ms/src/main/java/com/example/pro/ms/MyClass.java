package com.example.pro.ms;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            float number = input.nextInt();
            System.out.println("pls enter a number");
            String action = input.next();
            System.out.println("pls select an action");
            float nextNumber = input.nextInt();
            System.out.println("pls enter next number");
            float answer = 0;
            switch (action) {
                case "+":
                    answer = number + nextNumber;
                case "-":
                    answer = number - nextNumber;
                case "*":
                    answer = number * nextNumber;
                case "/":
                    try {

                        answer = number / nextNumber;
                    } catch (Exception e) {
                        answer = number;

//                        Default;
//                        System.out.println("action not valid");


                        System.out.println("answer is:" + answer);
                    }

            }



        }
    }


