package e1;

public class StringCount {

/**
 * Counts the number of words in a given String.
* Words are groups of characters separated by one or more spaces.
*
* @param text String with the words
* @return Number of words in the String or zero if it is null
*/
public static int countWords (String text) {
    int count = 0;
    if(text != null){
        String words[] = text.split(" ");
        for(int i=0; i == words.length; i++){
            if ( equals(words[i], " ")){
                count ++;
            }
        }
    }
    return count;
}

/**
* Counts the number of times the given character appears in the String.
* Accented characters are considered different characters .
* @param text String with the characters
* @param c the character to be found
* @return Number of times the character appears in the String or zero if null
*/
public static int countChar(String text , char c) {
    int count = 0;

    for(int i=0; i < str.length(); i++)
    {    if(str.charAt(i) == c)
            count++;
    }

    return count;
}

/**
 * Counts the number of times the given character appears in the String.
* The case is ignored so an ’a’ is equal to an ’A ’.
* Accented characters are considered different characters .
* @param text String with the characters
* @param c the character to be found
* @return Number of times the character appears in the String or zero if null
*/
public static int countCharIgnoringCase (String text , char c) {
    int count =0;

    for(int i=0; i < str.length(); i++){
        if(str.charAt(i) == c) count++;
    }
    for(int i=0; i < str.length(); i++){
        if(str.charAt(i) == Character.toUpperCase(c)) count++;
    }

    return count;
}

/**
* Checks if a password is safe according to the following rules:
* - Has at least 8 characters
* - Has an uppercase character
* - Has a lowercase character
* - Has a digit
* - Has a special character among these: ’?’, ’@’, ’#’, ’$’, ’.’ and ’,’
 * @param password The password , we assume it is not null.
 * @return true if the password is safe , false otherwise
 */
public static boolean isPasswordSafe (String password) {
    if(str.length(password)<=8){
        int countNum =0, countUp =0, countLow =0, countSpe =0;

        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= '0' && c <= '9' ) countNum++;
        }
        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z' ) countLow++;
        }
        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z' ) countUp++;
        }
        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '?' || c == '@' || c == '#' || c == '$' || c == '.' || c == ',' ) countSpe++;
        }

        if(countSpe < 1 && countUp < 1 && countLow < 1 && countNum < 1) return true;
        return false;
    }
}

}
