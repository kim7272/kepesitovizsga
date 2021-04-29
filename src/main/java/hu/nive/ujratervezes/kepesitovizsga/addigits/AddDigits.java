package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String s) {
        int result = 0;
        if (s.isEmpty() || s == null){
            return -1;
        }
        for (char c: s.toCharArray()) {
            if (Character.isDigit(c)) {
                result = result + Integer.parseInt(String.valueOf(c));
            }
        }
        return result;
    }
}
