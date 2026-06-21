import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000.0;
        int choice;
        double amount;

        do {
            System.out.println("\n===== ATM INTERFACE =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf("Current Balance: ₹%.2f\n", balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    amount = sc.nextDouble();

                    if (amount > 0) {
                        balance += amount;
                        System.out.printf("₹%.2f deposited successfully.\n", amount);
                        System.out.printf("Updated Balance: ₹%.2f\n", balance);
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    amount = sc.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid withdrawal amount!");
                    } else if (amount > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= amount;
                        System.out.printf("₹%.2f withdrawn successfully.\n", amount);
                        System.out.printf("Remaining Balance: ₹%.2f\n", balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}