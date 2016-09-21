/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcis2430lab1;

import java.util.Scanner;

/**
 *
 * @author dominickhera
 */
public class NewCIS2430Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scannerObj = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        
        String optionOne = "(1) Enter a full sentence.\n";
        String optionTwo = "(2) Print out all sentences entered thus far in the given order\n";
        String optionThree = "(3) Print out the number of sentences that have been entered thus far\n";
        String optionFour = "(4) Print out all sentences entered thus far in the reverse order.\n";
        String optionFive = "(5) Print out the number of characters in all sentences combined.\n";
        String optionSix = "(6) Calculate the total number of vowels contained in all stored sentences.\n";
        String optionSeven = "(7) Perform search for a given word using case insensitive comparisons.\n";
        String optionEight = "(8) Perform search for a given word using case sensitive comparisons.\n";
        String optionNine = "(9) End Program.";           
        
       int myInput = 0;
       int sentenceCount = 0;
       String[] sentenceArray = new String[99];
       
       while(myInput != 9)
       {
       System.out.println(optionOne + optionTwo + optionThree + optionFour + optionFive + optionSix + optionSeven + optionEight + optionNine);
       myInput = scannerObj.nextInt();
      
       switch(myInput) 
       {
           case 1:
               System.out.println("Enter a full sentence");
               sentenceArray[sentenceCount] = scannerString.nextLine();
//               
               sentenceCount++;
               break;
           case 2:
               System.out.println("\nAll Sentences Entered Thus Far:\n");
               for (int i = 0; i < sentenceCount; i++)
               {
                   System.out.println(sentenceArray[i]);
               }
               System.out.print("\n");
               break;
           case 3: 
               System.out.println(sentenceCount + " sentences have been entered thus far.\n");
               break;
           case 4:
               System.out.println("\nAll Sentences Entered Thus Far (in reverse order):\n");
               for (int i = sentenceCount; i > 0; i--)
               {
                   System.out.println(sentenceArray[i - 1]);
               }
               System.out.print("\n");
               break;
           case 5:
               
               int charCount = 0;
               for (int i = 0; i < sentenceCount; i++)
               {
                   charCount = charCount + sentenceArray[i].length();
               }
               System.out.println("the length of the sentence is " + charCount + "\n");
               break;
           case 6:
               
               break;
           case 7:
               
               break;
           case 8:
               
               break;
           case 9:
               System.out.println("Goodbye\n");
               System.exit(0);
           default:
               System.out.println("Please enter a number between 1-9");
       }
       }
        // TODO code application logic here
    }
    
}
