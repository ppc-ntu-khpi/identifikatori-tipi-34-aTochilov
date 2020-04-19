package domain;
/**
 * Solves the given problem (Finds evil numbers in given range)
 * @author Andrei
 */
public class Exercise {

    private static boolean checkEvilNumber(String binary) {
        short count = 0;
        for(short i = 0; i<binary.length(); i++){
            if(binary.charAt(i) == '1') count++;
        }
        return (count % 2) == 0;
    }

    public static String Calculate(short start, short end) {
        String res = "";
        for(short i = start; i<=end; i++){
            String binary = Integer.toBinaryString(i);
            if(checkEvilNumber(binary))
                res +=  Integer.toString(i)+ ", ";
        }
        return res.substring(0, res.length()-2) + ";";
    }
}
