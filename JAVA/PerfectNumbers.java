public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers less than 10,000:");
        for (int i = 1; i < 10000; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
    
    // Function to check if a number is perfect
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
