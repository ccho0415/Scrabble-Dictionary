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
    
    String fileName;
    // Constructor that only takes the dictionary file     
    public WordLists(String fileName){       
        this.fileName = fileName;      
    }

    // Linear Search checks for Length N 
    public void lengthN(int n) throws FileNotFoundException{       
        File dictFile = new File(fileName);
        Scanner input = new Scanner(dictFile);        
        String word;
        PrintWriter text = new PrintWriter("output.txt");
        while(input.hasNext()){
            word = input.nextLine();
            if(word.length() == n){
                text.println(word);
            }
        }
            text.close();
    }

    // Linear Search Checks for Length N and checks if it matches the first Letter
     public void startsWith(int n, char firstLetter)throws FileNotFoundException{
        File dictFile = new File(fileName);
        Scanner input = new Scanner(dictFile);        
        String word;
        PrintWriter text = new PrintWriter("output.txt");
        while(input.hasNext()){
            word = input.nextLine();
            if(word.length() == n && word.charAt(0) == firstLetter){
                text.println(word);
            }
        }
            text.close();
     }

    // Linear Search Checks for Length N and checks if any character but the first letter matches
    public void containsLetter(int n, char included)throws FileNotFoundException{
        File dictFile = new File(fileName);
        Scanner input = new Scanner(dictFile);        
        String word;
        PrintWriter text = new PrintWriter("output.txt");
        while(input.hasNext()){
            word = input.nextLine();
            if(word.length() == n){
                if(word.charAt(0) != included){
                    String check = Character.toString(included);
                    if(word.contains(check)){
                        text.println(word);
                    }    
                }
            }
        }
            text.close();
    }

    // Linear Search Checks for Length N and checks if there are m number of characters with a counter n
     public void multiLetter(int m, char included)throws FileNotFoundException{
        File dictFile = new File(fileName);
        Scanner input = new Scanner(dictFile);        
        String word;
        PrintWriter text = new PrintWriter("output.txt");
        while(input.hasNext()){
        int n = 0;           
            word = input.nextLine();
            for(int i=0; i< word.length(); i++){
                if(word.charAt(i) == included){
                    n++;
                }
            }
            if(n == m){
                text.println(word);                 
            }
            n=0;
        }
            text.close();
     }

} // end of class








