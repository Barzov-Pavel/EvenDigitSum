public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            int digit;

            while (true) {
                digit = number % 10;
                number /= 10;

                if (digit % 2 == 0) {
                    sum += digit;
                }
                if (number == 0) {
                    break;
                }
            }
            return sum;
        }
    }
}
