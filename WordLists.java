//*************************************
//
//  WordLists.java
//
//  Class to aid with Scrabble
//  Programming Project 5, COMS W1004
//
//
//  Your Name: Christine Chong  
//  Your Uni:   cc4190
//**************************************
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class WordLists{
    
    File dictionary;
    // Constructor that only takes the dictionary file     
    public WordLists(String fileName){

        File dictionary = new File(fileName);

    }


    public ArrayList<String> lengthN(int n){
        Scanner input = new Scanner(dictionary);
        ArrayList<String> output = new ArrayList<String>();
        String word;
        PrintWriter text = new PrintWriter("output.txt");
        while(input.hasNext()){
            word = input.nextLine();
            if(word.length() == n){
                text.println(word);
            }
        }
            output.close();
    
    }


    public ArrayList<String> startsWith(int n, char firstLetter){

        // your code here

    }


    public ArrayList<String> containsLetter(int n, char included){

        // your code here

    }

 
    public ArrayList<String> multiLetter(int m, char included){

        // your code here

    }

} // end of class








