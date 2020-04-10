package expensereport;


public class ExpansePrintReporter {
    private final ExpanseReport expanseReport = new ExpanseReport();
    private ReportPrinter printer;

    public void printReport(ReportPrinter printer) {
        this.printer = printer;
        expanseReport.totalUpExpanses();
        printExpenseAndTotal();
    }

    private void printExpenseAndTotal() {
        printHeader();
        printExpense();
        printerBottom(expanseReport.total, expanseReport.mealExpenses);
    }

    private void printExpense() {
        for (Expense expense : expanseReport.expenses) {
            printFormat(printer, expense, expense.getName());
        }
    }

    private void printFormat(ReportPrinter printer, Expense expense, String name) {
        printer.print(String.format("%s\t%s\t$%.02f\n",
                expense.isOverage() ? "X" : " ",
                name, expense.amount / 100.0));
    }

    private void printerBottom(int total, int mealExpenses) {
        printer.print(String.format("\nMeal expenses $%.02f", mealExpenses / 100.0));
        printer.print(String.format("\nTotal $%.02f", total / 100.0));
    }

    private void printHeader() {
        printer.print("Expenses " + getDate() + "\n");
    }

    public void addExpense(Expense expense) {
        expanseReport.addExpense(expense);
    }

    private String getDate() {
        return "9/12/2002";
    }
}
