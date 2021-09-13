package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key?");
        String answer = input.next();

        if (answer.equals("y")) {

            System.out.println("Are the battery terminals corroded?");
            answer = input.next();

            if (answer.equals("y")) {
                System.out.println("Clean terminals and try starting again.");
            } else {
                System.out.println("Replace cables and try again");
            }
        }else{
            System.out.println("Does the car make a slicking noise?");
            answer = input.next();
            if(answer.equals("y")){
                System.out.println("Replace the battery.");
            }else {
                System.out.println("Does the car crank up but fail to start?");
                answer = input.next();
                if(answer.equals("y")){
                    System.out.println("Check spark plug connection");
                }else{
                    System.out.println("Does the engine start and then die?");
                    answer = input.next();
                    if(answer.equals("y")){
                        System.out.println("Does you car have fuel injection?");
                        answer = input.next();
                        if(answer.equals("y")){
                            System.out.println("Get it in for service.");
                        }else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }else{
                        System.out.println("This should not be possible");
                    }

                }
            }

        }

    }
}
