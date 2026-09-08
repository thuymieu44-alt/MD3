interface IBank {
    void deposit(double amount);
    void withdraw(double amount);
}

// ---------------------- BankAccount ----------------------
class BankAccount implements IBank {
    private String accountId;
    private double balance;
    private String userName;
    private String phoneNumber;

    public BankAccount(String accountId, String userName, String phoneNumber) {
        this.accountId = accountId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.balance = 0; // mặc định số dư = 0
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền nạp phải lớn hơn 0");
            return;
        }
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút phải lớn hơn 0");
            return;
        }
        if (amount > balance) {
            System.out.println("Không đủ số dư để rút");
            return;
        }
        balance -= amount;
    }

    public void displayBalance() {
        System.out.println("Tài khoản: " + accountId + " | Chủ: " + userName + " | Số dư: " + balance);
    }
}

// ---------------------- Main ----------------------
class Main {
    public static void main(String[] args) {

        // Khởi tạo hai tài khoản
        BankAccount accountA = new BankAccount("A001", "Nguyễn Văn A", "0123456789");
        BankAccount accountB = new BankAccount("B001", "Nguyễn Văn B", "0987654321");

        // Nạp tiền vào tài khoản A
        accountA.deposit(1000);

        // Thực hiện chuyển tiền
        double transferAmount = 300;
        accountA.withdraw(transferAmount);
        accountB.deposit(transferAmount);

        // Hiển thị số dư
        accountA.displayBalance();
        accountB.displayBalance();
    }
}
