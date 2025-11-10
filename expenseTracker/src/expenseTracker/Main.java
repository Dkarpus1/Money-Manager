package expenseTracker;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = "expenses.dat";


        new File(file).delete();

        ExpenseManager manager = new ExpenseManager();
        
        //Gives user choices of what data they would like to enter 
        int choice = 0;
        while (choice != 5) {
            System.out.println(" MONEY MANAGER");
            System.out.println("1. Add Expense");
            System.out.println("2. Show All Expenses");
            System.out.println("3. Show By Category");
            System.out.println("4. Show Total Spent");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            
            //Checks what choice user entered 
            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String cat = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter note/description: ");
                    String note = sc.nextLine();
                    manager.addExpense(cat, amt, note);
                    break;

                case 2:
                    manager.showAll();
                    break;

                case 3:
                    System.out.print("Enter category to view: ");
                    String category = sc.nextLine();
                    manager.showByCategory(category);
                    break;

                case 4:
                    manager.totalSpent();
                    break;

                case 5:
                    System.out.println("Bye Bye");
                    break;

                default:
                    System.out.println("Not a Option.");
            }
        }

        sc.close();
    }
}