public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                builder.append(i);
            }
        }
        return builder.toString();
    }

    public static String getOddNumbers(int start, int stop) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                builder.append(i);
            }
        }
        return builder.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            int iSquared = i * i;
            builder.append(iSquared);
        }
        return builder.toString();
    }

    public static String getRange(int stop) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < stop; i++) {
            builder.append(i);
        }
        return builder.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < stop; i++) {
            builder.append(i);
        }
        return builder.toString();
    }

    public static String getRange(int start, int stop, int step) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            builder.append(i);
        }
        return builder.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            int iToExponent = (int) Math.pow(i, exponent);
            builder.append(iToExponent);
        }
        return builder.toString();
    }
}
