package expensereport;

/**
 * @author Geonguk Han
 * @since 2020-04-10
 */
public class DinnerExpense extends Expense {
    public DinnerExpense(int amount) {
        super(Type.DINNER, amount);
    }

    @Override
    boolean isOverage() {
        return amount > 5000;
    }

    @Override
    boolean isMeal() {
        return true;
    }

    @Override
    String getName() {
        return "Dinner";
    }
}
