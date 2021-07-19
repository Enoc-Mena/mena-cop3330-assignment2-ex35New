/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex35;

import java.util.Scanner;
import java.util.Random;

public class ChoosingWinner {

    public static void main(String[] args) {

        int inAmount;

        Scanner in = new Scanner(System.in);
        System.out.print("How many names do you want to enter: ");
        inAmount = in.nextInt();

        Scanner s = new Scanner(System.in);
        String[] array = new String[inAmount];

        for(int i = 0; i < array.length; i++) {

            System.out.print("Enter a name: ");
            array[i] = s.nextLine();

            if(array[i] == "") {

                break;

            }

        }

        Random rand = new Random();
        int randNum = rand.nextInt(array.length);

        System.out.print(array[randNum] + " is the winner!");

    }

}