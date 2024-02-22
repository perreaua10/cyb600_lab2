package edu.canisius.cyb.cyb600.lab2;

public class Task2 {
    /**
     * BASED on tests, this method will reverse and capitalize the input string.
     *
     * @param parameter1 String
     * @return String that's reversed/capitalized
     */
    public String method1(String parameter1){
        //check if string empty or null just return ""
        if (parameter1 == null || parameter1.equals("")){
            return "";
        }
        StringBuilder output = new StringBuilder(parameter1).reverse(); //StringBuilder allows or easy string building
        parameter1 = output.toString(); //changing parameter1 to the reversed 'output', and back to String type
        return parameter1.toUpperCase(); //return the reversed string in uppercase
    }

    /**
     * Concat's the first character (size) amount of times to the front of string.
     *
     * @param parameter2 String
     * @return String that has the first character appended to the front of it the amount of times as the length of string
     *
     */
    public String method2(String parameter2){
        if (parameter2 == null || parameter2.equals("")){
            return "";
        }
        //initialize a return string
        String retStr = parameter2;

        //for loop runs the amount of times as characters in the string
        for (int i=0; i < parameter2.toCharArray().length; i++){
            retStr = parameter2.toCharArray()[0] + retStr; //appends first characeter
        }

        return retStr;
    }
    /**
     * Reverses a sentence
     *
     * @param parameter3 String
     * @return String that has the words in reverse order.
     *
     */
    public String method3(String parameter3){
        if (parameter3== null || parameter3.equals("")){
            return "";
        }
        String str[] = parameter3.split(" ");
        String retStr = "";
        for (int i = str.length - 1; i > 0; i--){ //for loop that adds all words except the final word.
            retStr = retStr + str[i] + " ";
        }
        retStr = retStr + str[0]; //finish with the final word and no space
        return retStr;
    }
}
