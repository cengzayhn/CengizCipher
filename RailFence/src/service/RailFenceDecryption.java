package service;

public class RailFenceDecryption {
    public static String decryptRailFence(String cipher, int key) {
        if (key <= 1 || key >= cipher.length()) {
            return cipher;
        }
        int n = cipher.length();
        char[] result = new char[n];
        int cycleLen = 2 * key - 2;
        int index = 0;

        for (int i = 0; i < key; i++) {
            int step = cycleLen - 2 * i;
            for (int j = i; j < n; j += cycleLen) {
                result[j] = cipher.charAt(index++);
                if (step > 0 && step < cycleLen && j + step < n) {
                    result[j + step] = cipher.charAt(index++);
                }
            }
        }
        return new String(result);
    }
}
