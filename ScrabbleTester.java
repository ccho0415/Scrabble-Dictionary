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

public class ScrabbleTester{
    
    public static void main(String[] args){
        try{
            WordLists dictionary = new WordLists(args[0]);   
            dictionary.lengthN(20);
        }
        catch(Exception e){
            System.out.println(e);
        }
       
        
    }
}