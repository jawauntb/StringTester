import java.util.*;
import java.io.*;

public class StringTester {
  
  ////////////////////////////////////////////////////////////////////////
  //
  // 
  //  Computer Science 111, Fall 2016
  //
  ////////////////////////////////////////////////////////////////////////
  public static void main (String[] args) {
    
    doTest ("hello");
    doTest ("query");
    doTest ("Mississippi");
    doTest ("elephant");
    doTest ("Qatar");
    System.out.println();
    
  }  // main
  
  
  public static void doTest (String s) {
    
    System.out.println();
    System.out.println();
    System.out.println ("Testing this string: " + s);
    qThere(s);
    eThere(s);
    numVowels(s);
    dubLet(s);
    revd(s);
    palyD(s);
    
  }  // first, we check if there is a q in the string
  
  public static void qThere (String s) {  
    boolean foundQ = false; 
    
    for (int i=0; i<s.length(); ++i) { //iterate through every char
      if (s.charAt(i) == 'q')
      foundQ = true;
      if (s.charAt (i) == 'Q')
      foundQ = true;
    }
    
    if (foundQ){
      System.out.println ("It contains the letter q... how interesting!");
    } else {
      System.out.println ("It doesn't contain the letter q... how boring.");
      //then we check to see if there are any uppercase q's
    }
  }
  public static void eThere (String s) {
    boolean foundE = false;
    
    for (int i=0; i<s.length(); ++i) { // another iteration and if== then print
      if (s.charAt(i) == 'e'){ 
        foundE = true;
      }
      if (foundE = true){
        System.out.println ("It contains the letter e..so cool!");
      }else {
        System.out.println ("It doesnt have an e..sad"); 
      }
    }
    public static void numVowels (String s) {
      int v = 0;
      int len = (s.length());  // set a var for length 
      
      for (int i = 0; i < len ; i++){
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ) {
          v++; //if any char is any of these vowels (a\\e\\i\\etc) increment
        }
      }
      System.out.println ("there are " + v + " vowels");
    }
    
    public static void dubLet (String s) {
      
      boolean doubleLetters = false;
      char curr; //set prev and current strings
      char before;
      for (int p = 1; p<len ; p++) {
        before = s.charAt(p-1);
        curr = s.charAt(p); //check char before current char to see if it is doplicate
        if(curr==before){
          doubleLetters = true;
        }
      }
      
      if(doubleLetters){
        System.out.println("There are doubled letters in this String");
      }
      else{
        System.out.println("There are no doubled letters in this String");
      }
    }
    
    public static void revd (String s) {
      int len=s.length();
      String reversed = "";
      for (int j = (len-1); j>0; j--){ //start at the end and decrement to 0th position
        reversed = s.charAt(j)+reversed;
      }
      System.out.println(reversed);
    }
    
    public static void palyD (String s) {
      
      boolean palindrome = false;
      char fir;
      char lat;
      int county=0;
      int leny=s.length();
      for (int pl = 0; pl<(leny/2) ; pl++) { //while iterating before the halfway point
        fir = s.charAt(pl);// if the character at pl and character at the end +1 (since start at 0)
        lat = s.charAt(leny-(pl+1)); //if they are equal, then add to my counter
        if(fir==lat){
          county++;
        }
      }
      if ((county*2)==leny){
        palindrome= true; //if the counter to halfway x2 is the full length, each char matched the n-(pl+1)
      } //if true, then print that it is a palindrome
      if(palindrome){
        System.out.println("This String is a palindrome");
      } 
      else{
        System.out.println("This String isn't a palindrome");
      }
    }
    
  }
