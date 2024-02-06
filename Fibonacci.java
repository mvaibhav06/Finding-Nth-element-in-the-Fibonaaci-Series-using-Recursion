public class Fibonacci {
    public static int findNthElement(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        return findNthElement(n-1) + findNthElement(n-2);
    }
    public static void main(String[] args) {
        System.out.println(findNthElement(9));
    }
}
