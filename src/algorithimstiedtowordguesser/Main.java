package algorithimstiedtowordguesser;

public class Main {
    public static void main(String [] args){
        System.out.println(getCount("Celebration"));
        System.out.println(charCount('b', "big fat bubble"));
        System.out.println(removeVowels("Windmills are the greatest threat in the US to both bald and golden eagles. Media claims fictional ‘global warming’ is worse."));

    }

    public static int getCount(String str) {
        // intializing count to 0
        int vowelsCount = 0;
        // Your code here
        //iterating through str parameter.
        for(int i = 0 ; i < str.length(); i++){
            //using charAt method to iterate through whole Array.
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o'||str.charAt(i)=='u'){

               // using increment operator to increment through array
                vowelsCount++;
            }
        }
       // return vowelCount;
        return vowelsCount;
    }
    public static int charCount(char c, String str) {
        // initialize the word count to 0
        int wordCount = 0;
        //iterating through the string we use () due to the string being an object
        for(int i = 0 ; i <str.length(); i++){
            // using the charAt method in the conditional
            if(str.charAt(i) == c){
                // it increments through each character
                wordCount++;
            }
        }
        // returning the overall count
        return wordCount;
    }

    public static String removeVowels(String s) {

        //we use the replace ALL method to replace all the characters that are equivilent.
        //return s.replaceAll("[aeiouAEIOU]","");

       // I also used another way of the Replace ALL method by intializing it to a  new String variable
        String newWord = s.replaceAll("[aeiouAEIOU]","");
        //then returning that new intialized word.
        return newWord;

    }

}
