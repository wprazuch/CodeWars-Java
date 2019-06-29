// https://www.codewars.com/kata/complementary-dna/train/java

public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder output = new StringBuilder();

        for(char c: dna.toCharArray())
        {
            if(c == 'A')
                output.append('T');
            else if(c == 'T')
                output.append('A');
            else if(c == 'C')
                output.append('G');
            else
                output.append('C');
        }

        return output.toString();
    }
}
