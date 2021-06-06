/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;
public class MadLib {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String noun = "";
        String verb = "";
        String adjective = "";
        String adverb = "";

        System.out.print("Enter a noun: ");
        noun = input.nextLine();
        System.out.print("Enter a verb: ");
        verb= input.nextLine();
        System.out.print("Enter an adjective: ");
        adjective = input.nextLine();
        System.out.print("Enter an adverb: ");
        adverb = input.nextLine();
        System.out.println("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+"? That's hilarious!");
    }
}
