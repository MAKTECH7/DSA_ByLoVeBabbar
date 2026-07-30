public class SumOfString {
    public static void main(String[] args) {
            String str = "ab12cd34ef5";
            int sum = 0;

            for(int i = 0;i<str.length();i++){
                char ch = str.charAt(i);

                if(Character.isDigit(ch)){
                    sum += ch - '0';
                }

            }
            System.out.println(sum);
    }
}
