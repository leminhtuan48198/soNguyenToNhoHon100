public class main {
    public static void main(String[] args) {
//        kiem tra so nguyen to
        for (int number = 2; number <= 100; number++) {
            boolean check = true;
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(number);
            }
        }
    }
}