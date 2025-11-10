package expenseTracker;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class ExpenseManager implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Expense> list = new ArrayList<>();

    public void addExpense(String category, double amount, String note) {
        Expense e = new Expense(category, amount, note, LocalDate.now());
        list.add(e);
        System.out.println("Expense added!");
    }

    public void showAll() {
        if (list.size() == 0) {
            System.out.println("No expenses yet");
            return;
        }
        System.out.println("\n=== All Expenses ===");
        for (Expense e : list) {
            System.out.println(e);
        }
    }

    public void totalSpent() {
        double total = 0;
        for (Expense e : list) {
            total += e.getAmount();
        }
        System.out.println("Total spent so far: $" + total);
    }

    public void showByCategory(String cat) {
        boolean found = false;
        double total = 0;
        System.out.println("\n Expenses in category: " + cat);
        for (Expense e : list) {
            if (e.getCategory().equalsIgnoreCase(cat)) {
                System.out.println(e);
                found = true;
                total += e.getAmount();
            }
        }
        if (!found) {
            System.out.println("None found in that category.");
        } else {
            System.out.println("Total for " + cat + ": $" + total);
        }
    }

    public ArrayList<Expense> getList() {
        return list;
    }
}
