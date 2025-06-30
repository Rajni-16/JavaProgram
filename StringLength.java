/*Write a program to print the length of each word of the sentence given below as well as the length of the whole sentence.
"Coding on CodeChef" */

public class StringLength{
    public static void main (String[] args)
    {
    // your code goes here
    String sentence = "Coding on CodeChef";                // declare and initialize sentence variable of String data type with string of words
    String[] stringArray = sentence.split(" ");      // using split method of string that will split where it finds space " " and Stores each word as a separate element in an array
    String noSpaces = sentence.replace(" ","");  // spaces in sentence string is removed

    for(int i =0; i < stringArray.length ;i++)              // the loop will run as long as the i is less than the length of the string array
    {
        System.out.println(stringArray[i] + "  -" + stringArray[i].length());       // it will print the element in array based on index and also print the length of element string

    }
    System.out.println(sentence + " -" + noSpaces.length());               // it will print the length of the sentence with removed spaces


    }
}