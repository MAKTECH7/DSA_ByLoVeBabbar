public class Reverse {
    public static void main(String[] args) {
        int num = 151;
        int lastdigit = 0;
        int revNum = 0;
        int dup = num;
        while(num>0){
            lastdigit = num%10;
            num = num/10;
            revNum = (revNum * 10) + lastdigit;
        }
        System.out.println(revNum);
        if(dup==revNum){
            System.out.println("it's palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
