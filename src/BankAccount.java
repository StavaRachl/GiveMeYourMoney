class BankAccount {
    int Balance;
    int Amount;

    BankAccount(int b) {
        Balance = b;
        if (Balance >= 1) {
            System.out.println("Чтение денег завершенно. Ваш баланс составляет: " + Balance + " рублей");
        } else {
            System.out.println("Чтение денег незавершенно. Проверьте ваш баланс и повторите снова.");
        }
    }

    void DownBalance(int amount) {
        if (Balance >= amount) {
            Balance -= amount;
        } else {
            System.out.println("Ошибка при снятии денег.");
        }
    }

    int GetBalance(int amount) {
        return Balance;
    }
}
