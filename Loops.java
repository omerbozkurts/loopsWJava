// Creates a public class named Loops
public class Loops {
  

    /* Creates a public method named replaceLetters that takes a String and an integer as parameters
     * and returns a String. The method is static to be callable from the class.
     * It shifts each character in the given String to the right by the specified number 
     * within the English alphabet.
     */
    public static String replaceLetters(String txt, int number) {
      
      // Creates an integer variable named length and assigns the length of the String parameter to it
      int length = txt.length();
      
      // Creates a StringBuilder object named str
      StringBuilder str = new StringBuilder();
      
      // Iterates over the characters in the String using a for loop
      for (int i = 0; i < length; i++) {

        // Checks if the character is a lowercase letter and if shifting won't exceed 'z'
        if (txt.charAt(i) > 96 && txt.charAt(i) < 123 && txt.charAt(i) + number <= 122) {
          str.append((char) (txt.charAt(i) + number));
        }

        // Checks if shifting exceeds 'z' and wraps around to the beginning of the alphabet
        else if (txt.charAt(i) > 96 && txt.charAt(i) < 123 && txt.charAt(i) + number > 122) {
          str.append((char) (txt.charAt(i) - 26 + number));
        }

        // Checks if the character is an uppercase letter and if shifting won't exceed 'Z'
        else if (txt.charAt(i) > 64 && txt.charAt(i) < 91 && txt.charAt(i) + number <= 90) {
          str.append((char) (txt.charAt(i) + number));
        }

        // Checks if shifting exceeds 'Z' and wraps around to the beginning of the alphabet
        else if (txt.charAt(i) > 64 && txt.charAt(i) < 91 && txt.charAt(i) + number > 90) {
          str.append((char) (txt.charAt(i) - 26 + number));
        }

        // Appends the character directly for non-alphabetic characters
        else {
          str.append((char) (txt.charAt(i)));
        }

      }
      
      // Converts the StringBuilder object 'str' to a String and returns it
      return str.toString();

    }
    
    /* Creates a public method named stripFromBothEnd that takes a String parameter
     * and returns a String. The method is static to be callable from the class.
     * It removes leading and trailing spaces from the given String.
     */
    public static String stripFromBothEnd(String txt) {

      // Creates an integer variable named length and assigns the length of the String parameter to it
      int length = txt.length();
      
      // Returns an empty String if the input String is empty
      if (length == 0) 
        return "";
      
      // Creates a StringBuilder object named 'str'
      StringBuilder str = new StringBuilder();
      
      // Initializes variables to store the first and last characters of the String
      char start = txt.charAt(0);
      char end = txt.charAt(length - 1);
      
      // Iterates over the characters in the String using a for loop
      for (int i = 0; i < length; i++) {

        // Checks if the last character is a space and the String has only one character
        if (end == ' ' && length == 1) {
          return "";
        }
        
        // Removes trailing spaces by updating the 'end' variable
        if (end == ' ') {
          end = (char) (txt.charAt(length - i - 2));
          length--;
          i--;
        }

        // Appends non-space characters to the StringBuilder 'str'
        else if (start != ' ' && end != ' ') {
          str.append((char) (txt.charAt(i)));
        }

        // Updates the 'start' variable if the first character is a space
        else if (start == ' ') {
          start = (char) (txt.charAt(i + 1));
        }

      }
      
      // Converts the StringBuilder object 'str' to a String and returns it
      return str.toString();
    }
    
    /* Creates a public method named removeRepeatingChars that takes a String parameter
     * and returns a String. The method is static to be callable from the class.
     * It removes repeated characters from the given String.
     */
    public static String removeRepeatingChars(String txt) {

      // Creates an integer variable named 'length' and assigns the length of the String parameter to it
      int length = txt.length();
      
      // Creates a StringBuilder object named 'str'
      StringBuilder str = new StringBuilder();
      
      // Iterates over the characters in the String using a for loop
      for (int i = 0; i < length; i++) {

        // Initializes a boolean variable 'isHere' to check if the character is already in 'str'
        boolean isHere = false;
        
        // Iterates over the String to check if the character repeats
        for (int j = i - 1; j >= 0; j--) {

          // Updates 'isHere' to true if the character is found earlier in the String
          if (txt.charAt(i) == txt.charAt(j)) {
            isHere = true;
          }

        }
        
        // Appends the character to 'str' if it is not already present
        if (!isHere) {
          str.append((char) (txt.charAt(i)));
        }

      }
      
      // Converts the StringBuilder object 'str' to a String and returns it
      return str.toString();

    }
    
    /* Creates a public method named compressText that takes a String parameter
     * and returns a String. The method is static to be callable from the class.
     * It compresses consecutive repeating characters in the given String by
     * writing the character once followed by the count of repetitions.
     */
    public static String compressText(String txt) {

      // Creates an integer variable named 'length' and assigns the length of the String parameter to it
      int length = txt.length();
      
      // Creates a StringBuilder object named 'str'
      StringBuilder str = new StringBuilder();
      
      // Counter variable to store the count of consecutive repeating characters
      int counter;
      
      // Iterates over the characters in the String using a for loop
      for (int i = 0; i < length; i++) {

        // Resets the counter to 1 at the beginning of each iteration
        counter = 1;
        
        // Appends the character to 'str'
        str.append((char) (txt.charAt(i)));
        
        // Counts consecutive repeating characters using a while loop
        while (i + 1 != length && txt.charAt(i) == txt.charAt(i + 1)) {
          counter++;
          i++;
        }
        
        // Appends the counter to 'str' if it is greater than 1
        if (counter > 1) {
          str.append(counter);
        }

      }
      
      // Converts the StringBuilder object 'str' to a String and returns it
      return str.toString();

    }

  }