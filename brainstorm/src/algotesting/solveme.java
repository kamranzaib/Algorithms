package algotesting;

public class solveme {

    public static void main(String[] args) {

        String str = "aaabbcccdddde";
        System.out.println(solveme.Compress(str));




    }




    public static String Compress(String str) {
        StringBuilder compression = new StringBuilder();
        int CountConsective = 0;
        for (int i = 0; i < str.length(); i++) {
            CountConsective++;


            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compression.append(str.charAt(i));
                compression.append(CountConsective);
                CountConsective = 0;


            }

        }
        return compression.length() < str.length() ? compression.toString() : str;

    }

}