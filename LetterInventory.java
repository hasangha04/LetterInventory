/* 
Purpose:
This program takes in user String input and count each letter
It will print out how many of each letter you have types
it will not account for special characters and spaces
*/
package com.company;

import java.util.Scanner;

public class LetterInventory {

    public static void main(String[] args) {//main begins
        Scanner input = new Scanner(System.in);
        int[] wordCount = new int[26];// counts number of each letter used in sentence
        int alphabet = 25;
        char [] letters = new char[26];// holds a letter for each index
        String sentence;

        System.out.println("Please type a sentence");
        sentence = input.nextLine();
        sentence = toLowerCase(sentence);
        countTest(wordCount, sentence, alphabet, letters);
        results(wordCount, letters);
    }// end of main

    // this method makes every character in the sentence lower case
    public static String toLowerCase(String sentence){
        return sentence.toLowerCase();
    }// end of toLowerCase

    // this method counts how many letters are used in the sentence
    public static int[] countTest(int[] wordCount, String sentence, int alphabet, char[] letters){
        for(int i = 0; i <= alphabet; i++){
            letters[i] = (char) ('a' + i);// populates array with all letter
        }// end of for loop
        for(int i = 0; i < sentence.length(); i++){
            for(int j = 0; j <= alphabet; j++){
               if(sentence.charAt(i) == (letters[j])){
                    wordCount[j]++;// counts what letters are used and how many
                }// end of if statement
            }// end of nested for loop
       } // end of for loop
        return wordCount;
    }// end of countTest

    // this method prints out what letters are used and how many
    public static void results(int[] wordCount, char[] letters){
        System.out.println("results: ");
        useLetters(wordCount);
        for(int i = 0; i < wordCount.length; i++){
            if (wordCount[i] > 0){
                System.out.println(letters[i] + " = " + wordCount[i]);
            } // end of if statement
        }// end of for loop
    }// end of results

    // this method checks if no letters are used in the sentence
    public static void useLetters(int[] wordCount){
        boolean check = false;
        for(int i = 0; i < wordCount.length; i++){
            if(wordCount[i] == 0){//o option if letters are not used
                check = false;
            }// end of if
            else if(wordCount[i] != 0){// option if letters are used
                check = true;
                break;
            }// end of else if
        }// end for loop
        if(check == false){
            System.out.println("No letters used!");
        }// end of if
    }// end of useLetters
}//end of the class
