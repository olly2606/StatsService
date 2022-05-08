package ru.netology.sqr;

public class SQRService {
    public int sqrСount(int min, int max) {
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr < min) {
                continue;
            }
            if (sqr > max) {
                continue;
            }
            quantity++;
        }
        return quantity;

    }
}
