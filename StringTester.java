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
    
    // first, we check if there is a q in the string
    
    boolean foundQ = false; 
    
    
    for (int i=0; i<s.length(); ++i) {
      if (s.charAt(i) == 'q')
      foundQ = true;
      if (s.charAt (i) == 'Q')
      foundQ = true;
    }
    
    if (foundQ)
    System.out.println ("It contains the letter q... how interesting!");
    else
    System.out.println ("It doesn't contain the letter q... how boring.");
    //then we check to see if there are any uppercase q's
    
    boolean foundE = false;
    
    for (int i=0; i<s.length(); ++i) { // add more code here
      if (s.charAt(i) == 'e') 
      foundE = true;
    }
    if (foundE = true)
    System.out.println ("It contains the letter e..so cool!");
    else 
    System.out.println ("It doesnt have an e..sad"); 
    
    int v = 0;
    int len = (s.length());  // the length is actually one less than the value the computer displays
    
    for (int i = 0; i < len ; i++)
    {if (s.charAt(i) == 'a' | s.charAt(i) == 'e' | s.charAt(i) == 'i' | s.charAt(i) == 'o' | s.charAt(i) == 'u' )
    v++;
  }
  System.out.println ("there are " + v + " vowels");
  
  boolean doubleLetters = false;
  char curr;
  char before;
  for (int p = 1; p<len ; p++) {
    before = s.charAt(p-1);
    curr = s.charAt(p);
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
  
  String reversed = "";
  
 
