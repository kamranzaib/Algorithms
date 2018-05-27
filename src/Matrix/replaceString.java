package Matrix;
public class replaceString {

    public static void main(String[] args) {

        System.out.println( replaceString.replaceMethod("Mr John Smith   " ));
    }
public static  String replaceMethod(String str){
        String[] words = str.split(" ");
        StringBuilder sentence = new StringBuilder(words[0]);

        for (int i = 0; i< words.length; i++){
            sentence.append("%20");
            sentence.append(words[i]);
        }
        return sentence.toString();
}

}