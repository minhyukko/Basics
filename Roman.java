import java.util.HashMap;
import java.util.Map;

public class Roman {

    /*
     * Function Name: intToRoman
     * Description: The function will receive an integer as an input and produce a roman numeral.
     * Author: Minhyuk Ko
     * Student ID: minhyukko
     * Code Editor: Vim
     */
    public static String intToRoman(int num) {
        int[] values = { 1000, 500, 100, 50, 10, 5, 1 };
        String[] symbols = { "M", "D", "C", "L", "X", "V", "I" };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }
        /*
     * Function Name: romanToInt Function
     * Description: The function will transfer Roman Code to Integer. By adding parameter, it will return an integer.
     * Author: Tian Yu (Edward) Shiung
     * Student ID: stianyu99
     * Code Editor: Visual Studio Code
     */
    public int romanToInt(String s) {

        //Using HashMap to store letters and corrseponding values to solve this problem
        Map<Character, Integer> dic = new HashMap<>();
        dic.put('I',1);
        dic.put('V',5);
        dic.put('X',10);
        dic.put('L',50);
        dic.put('C',100);
        dic.put('D',500);
        dic.put('M',1000);

        //Calculate the total
        int total = 0;

        for(int i = 0; i < s.length(); i ++){

            char curr = s.charAt(i);
            char next = (i + 1 < s.length()) ? s.charAt(i + 1) : '\0';


            int currValue = dic.get(curr);
            int nextValue = (next != '\0') ? dic.get(next) : 0;

            if (currValue < nextValue) {
                total -= currValue;
            } else {
                total += currValue;
            }
        }

        System.out.println(total);
        return total;
    }
}
