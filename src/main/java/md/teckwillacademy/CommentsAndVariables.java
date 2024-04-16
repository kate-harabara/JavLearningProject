package md.teckwillacademy;

public class CommentsAndVariables {
    public static void main(String[] args) {
        boolean isHotOutside;
        isHotOutside = true;
        System.out.println("The value of our variable is: " + isHotOutside);

        boolean isFriday = true;
        System.out.println("The value of our variable is: " + isFriday);

        char firstCharFromAscii;
        char lastCharFromAscii;
        byte lowerLimitOfByteDataType;
        byte upperLimitOfByteDataType;
        short lowerLimitOfShortDataType;
        short upperLimitOfShortDataType;
        int lowerLimitOfIntDataType;
        int upperLimitOfIntDataType;
        long lowerLimitOfLongDataType;
        long upperLimitOfLongDataType;
        float lowerLimitOfFloatDataType;
        float upperLimitOfFloatDataType;
        double lowerLimitOfDoubleDataType;
        double upperLimitOfDoubleDataType;

        // Initialization of the above variables

        firstCharFromAscii = 0;
        System.out.println("The value of our variable is: " + (int) firstCharFromAscii);

        lastCharFromAscii = 12;
        System.out.println("The value of our variable is: " + (int) lastCharFromAscii);

        lowerLimitOfByteDataType = -128;
        System.out.println("Lower limit of byte data type: " + lowerLimitOfByteDataType);

        upperLimitOfByteDataType = 127;
        System.out.println("Upper limit of byte data type: " + upperLimitOfByteDataType);

        lowerLimitOfShortDataType = -32768;
        System.out.println("Lower limit of short data type: " + lowerLimitOfShortDataType);

        upperLimitOfShortDataType = 32767;
        System.out.println("Upper limit of short data type: " + upperLimitOfShortDataType);

        lowerLimitOfIntDataType = -2147483648;
        System.out.println("Lower limit of int data type: " + lowerLimitOfIntDataType);

        upperLimitOfIntDataType = 2147483647;
        System.out.println("Upper limit of int data type: " + upperLimitOfIntDataType);

        lowerLimitOfLongDataType = -9223372036854775808L;
        System.out.println("Lower limit of long data type: " + lowerLimitOfLongDataType);

        upperLimitOfLongDataType = 9223372036854775807L;
        System.out.println("Upper limit of long data type: " + upperLimitOfLongDataType);

        lowerLimitOfFloatDataType = -3.4E+38f;
        System.out.println("Lower limit of float data type: " + lowerLimitOfFloatDataType);

        upperLimitOfFloatDataType = 3.4E+38f;
        System.out.println("Upper limit of float data type: " + upperLimitOfFloatDataType);

        lowerLimitOfDoubleDataType = -1.7E+308d;
        System.out.println("Lower limit of double data type: " + lowerLimitOfDoubleDataType);

        upperLimitOfDoubleDataType = 1.7E+308d;
        System.out.println("Upper limit of double data type: " + upperLimitOfDoubleDataType);
    }
}
