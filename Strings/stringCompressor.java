package Strings;

public class stringCompressor {
    public static String compressString (String str) {
        StringBuilder sb = new StringBuilder("");
        int counter = 1;

        char ch = str.charAt(0);
        sb.append(ch);
        for(int i=1; i<str.length(); i++){

            if(ch == str.charAt(i) && i<str.length()){
                counter++;
            }else{
                if(counter != 1)
                    sb.append(counter);
                counter = 1;
                ch = str.charAt(i);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String name = "aabbb";
        System.out.println(compressString(name));
    }
}
