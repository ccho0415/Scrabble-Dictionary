//*************************************
//
//  ScrabbleTester.java
//
//  Class to test the WordLists class
//  Programming Project 5, COMS W1004
//
//
//  Your Name: Christine Chong  
//  Your Uni:   cc4190
//**************************************
import java.util.Scanner;
import java.io.*;

public class ScrabbleTest{
    
    public static void main(String[] args){
        try{
            WordLists dictionary = new WordLists(args[1]);    
        }
        catch(IOException e){
            System.out.println(e);
        }
       
        
    }
}