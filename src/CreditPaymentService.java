public class CreditPaymentService {
    double calculate(int time, double sum) {
        double i, pay = 0;
        i = 9.99 / 12 / 100;
        switch (time) {
            case 1:
                pay = sum * i * Math.pow(i + 1, 12) / (Math.pow(i + 1, 12) - 1);
                break;
            case 2:
                pay = sum * i * Math.pow(i + 1, 24) / (Math.pow(i + 1, 24) - 1);
                break;
            case 3:
                pay = sum * i * Math.pow(i + 1, 36) / (Math.pow(i + 1, 36) - 1);
                break;

        }
        return pay;
    }
}
