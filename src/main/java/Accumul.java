public class Accumul {

    public static String accum(String s) {
        s = s.toLowerCase();
        String[] splitted = s.split("");
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < splitted.length; i++)
        {
            output.append(splitted[i].toUpperCase());
            for(int j = 0; j < i; j++)
            {
                output.append(splitted[i]);
            }
            output.append("-");
        }
        return output.toString().substring(0, output.toString().length()-1);
    }

}
