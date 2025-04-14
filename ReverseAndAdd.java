public class ReverseAndAdd {
    
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        String strNum1 = "123";
        String strNum2 = "456";
        
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        
        int reversedNum1 = reverseNumber(num1);
        int reversedNum2 = reverseNumber(num2);
        
        int sum = reversedNum1 + reversedNum2;
        
        System.out.println("Sum of reversed numbers: " + sum);
    }
}