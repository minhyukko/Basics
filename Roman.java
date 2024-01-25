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
}

