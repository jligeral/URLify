/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the
 * "true" length of the string.
 */

public class Urlify {
    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        int trueLength = 13;
        System.out.println(urlify(str, trueLength)); // Mr%20John%20Smith

        String str2 = "Mr John Smith";
        int trueLength2 = 13;
        System.out.println(urlify(str2, trueLength2));
    }
    public static String urlify(String str, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int newLength = trueLength + spaceCount * 2;
        char[] strArray = new char[newLength];

        int index = newLength - 1;
        for (int i = trueLength - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                strArray[index] = '0';
                strArray[index - 1] = '2';
                strArray[index - 2] = '%';
                index -= 3;
            } else {
                strArray[index] = str.charAt(i);
                index--;
            }
        }
        return new String(strArray);
    }
}
