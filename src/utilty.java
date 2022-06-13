public class utilty {
       static final String numbersDictionary = "0123456789";
    public static void main(String[] args) throws InterruptedException {

    }
        public static int randNumber(int min, int max) {
            return (int) ((Math.random() * (max - min)) + min);
        }

        public static String generateRandNumberWithLength(int length) {
            String number="";
            for (int i = 0; i < length; i++) {

                number += numbersDictionary.charAt(randNumber(0, numbersDictionary.length() - 1));
            }

        return number;
}}
