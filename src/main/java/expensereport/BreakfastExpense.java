package expensereport;

/**
 * @author Geonguk Han
 * @since 2020-04-10
 */
public class BreakfastExpense extends Expense {
    public BreakfastExpense(int amount) {
        super(Type.BREAKFAST, amount);
    }

    @Override
    boolean isOverage() {
        return amount > 1000;
    }

    @Override
    boolean isMeal() {
        return true;
    }

    @Override
    String getName() {
        return "Breakfast";
    }
}
