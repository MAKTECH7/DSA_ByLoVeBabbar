public class FibbonaciSeries{
    public static void main(String[] args){
        int num =6;
        int first =0;
        int second=1;
        int next;

        for(int i =0;i<=num;i++){
            System.out.print(first +" ");
            next = first+second;
            first = second;
            second = next;
        }
    }
}