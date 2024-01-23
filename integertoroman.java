public class IntegerToRoman {
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

