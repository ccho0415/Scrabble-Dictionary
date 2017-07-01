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
            String instruction = args[1];
            int number = Integer.parseInt(args[2]);
            if(args[1].equals("length")&& args.length == 3){
                dictionary.lengthN(number);    
            }else if(args[1].equals("starts") && args.length == 4){
                char character = args[3].charAt(0);    
                dictionary.startsWith(number, character);    
            }else if(args[1].equals("contains") && args.length == 4){
                char character = args[3].charAt(0);
                dictionary.containsLetter(number, character);    
            }else if(args[1].equals("multi") && args.length == 4){
                char character = args[3].charAt(0);
                dictionary.multiLetter(number, character);   
            }       
        }
        catch(FileNotFoundException e){
            System.out.println("Please enter a valid dictionary file");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please put in the proper arguments name : "+"java ScrabbleTester dictionaryFile instruction number char(if applicable)");
        }catch(Exception e){
            System.out.println(e);
        }      
       
        
    }
}