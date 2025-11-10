package expenseTracker;

import java.io.Serializable;
import java.time.LocalDate;

public class Expense implements Serializable {
    private static final long serialVersionUID = 1L;

    private String category;
    private double amount;
    private String note;
    private LocalDate date;

    public Expense(String category, double amount, String note, LocalDate date) {
        this.category = category;
        this.amount = amount;
        this.note = note;
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getNote() {
        return note;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return date + " | " + category + " | $" + amount + " | " + note;
    }
}