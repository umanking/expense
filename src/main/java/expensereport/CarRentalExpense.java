package expensereport;

/**
 * @author Geonguk Han
 * @since 2020-04-10
 */
public class CarRentalExpense extends Expense {
    public CarRentalExpense(int amount) {
        super(Type.CAR_RENTAL, amount);
    }

    @Override
    boolean isOverage() {
        return false;
    }

    @Override
    boolean isMeal() {
        return false;
    }

    @Override
    String getName() {
        return "Car Rental";
    }
}
