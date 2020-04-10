package expensereport;

import java.util.ArrayList;
import java.util.List;

public class ExpanseReport {
    List<Expense> expenses = new ArrayList<Expense>();
    int total = 0;
    int mealExpenses = 0;

    public ExpanseReport() {
    }

    void totalUpExpanses() {
        for (Expense expense : expenses) {
            mealExpanse(expense);
        }
    }

    void mealExpanse(Expense expense) {
        if (expense.isMeal())
            mealExpenses += expense.amount;
        total += expense.amount;
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }
}