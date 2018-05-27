package Matrix;

public class PalindromePermutation{
    //check more than one character has odd count
    public static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    public static boolean isPermutationOfPalindrome(String phrase) {
        int[] table = Common.buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    public static void main(String[] args) {
        String pali = "Ratzs live on no evil starz";
        System.out.println(isPermutationOfPalindrome(pali));
        String pali2 = "Zeus was deified, saw Suez";
        System.out.println(isPermutationOfPalindrome(pali2));
    }
}
