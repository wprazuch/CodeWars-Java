// https://www.codewars.com/kata/convert-string-to-camel-case/train/java

import java.lang.StringBuilder;
class Solution{

    static String toCamelCase(String s){
        String splitter;
        if(s.contains("-")) {
            splitter = "-";
        }
        else {
            splitter = "_";
        }

        String[] words = s.split(splitter);
        StringBuilder sb = new StringBuilder(words[0]);

        for(int i = 1; i < words.length; i++)
        {
            sb.append(capitalize(words[i]));
        }

        return sb.toString();
    }

    private static String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }
}
