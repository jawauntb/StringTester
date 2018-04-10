This program tests various strings with a set of prescribed tests.
doTest() is a method that we will use to test strings in various
ways.  The main method calls doTest() five times to test five
different strings.

doTest() currently does a check to see if the character 'q' appears
somewhere in string s.  It begins by setting "foundQ" to be false.  It
then loops through the string, checking each character.  If a 'q' is
found, it sets "foundQ" to be true.

This test also tests for palindromes and common characters between strings
