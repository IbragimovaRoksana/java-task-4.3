import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Программа расчета процентной ставки кредитования");
//        Scanner credit = new Scanner(System.in);
//        System.out.println("Введите необходимую сумму:");
//        double sum = credit.nextDouble();
//        System.out.println("На сколько лет вам нужен займ?(1-3 лет)");
//        int time = credit.nextInt();


        double sum = 1000000;
        int time1 = 1, time2 = 2, time3 = 3;
        CreditPaymentService payment = new CreditPaymentService();
        double payment_per_month1 = payment.calculate(time1, sum);
        System.out.println("Ваш ежемесячный платеж на 1 год равен:" + (int) payment_per_month1);
        double payment_per_month2 = payment.calculate(time2, sum);
        System.out.println("Ваш ежемесячный платеж на 2 года равен:" + (int) payment_per_month2);
        double payment_per_month3 = payment.calculate(time3, sum);
        System.out.println("Ваш ежемесячный платеж на 3 года равен:" + (int) payment_per_month3);
    }
}
