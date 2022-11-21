public class palindrom {
    static boolean isPalindrom(int number) {
        int temp = number, lastNumber;
        int newNumber = 0;

        while (temp != 0) {
            lastNumber = temp % 10;
            newNumber = (newNumber * 10) + lastNumber;


            temp /= 10;
        }

        if (newNumber == number)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(523325));
    }
}
