/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner nameOfUser = new Scanner(System.in);
        System.out.println( "What is the quote?" );
        String Quote = nameOfUser.nextLine();
        System.out.println( "Who said it?");
        String Name = nameOfUser.nextLine();
        System.out.println(Name+" says,\""+ Quote +"\"");
    }
}
