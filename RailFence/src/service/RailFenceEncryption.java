package service;

public class RailFenceEncryption {
    public static String encryptRailFence(String text, int key) {

        StringBuilder result = new StringBuilder();
        try{
            int n = text.length();
            int cycleLength = 2 * key - 2;

            if (key > n){
                throw new Exception("Key cannot be bigger than length of text");

            }else{
                for (int row = 0; row < key; row++) {
                    for (int i = 0; i < n; i++) {
                        if (i % cycleLength == row || i % cycleLength == cycleLength - row) {
                            result.append(text.charAt(i));
                        }
                    }
                }
            }
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
        return result.toString();
    }
}
