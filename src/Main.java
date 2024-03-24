public class Main {
    public static void main(String[] args) {

        int score = 100;
        int summa = 1100;
        int bonus = (summa / 100);
        if (summa < 1000) {
            System.out.println(score + summa);
        } else {
            System.out.println(score + summa + bonus);
        }
    }
}