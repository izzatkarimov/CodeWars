// Write a function which converts the input string to uppercase.

// Solution:

class Upper{
  public static String MakeUpperCase(String str){
    // Check if the input string is null
        if (str == null) {
            return null;
        }
    // Convert the input string to uppercase using the toUpperCase() method
        String result = str.toUpperCase();
        
        return result;
  }
}