public class RewardValue {

    double cashValue;
    int miles;

    public RewardValue(double cash) {
        this.cashValue = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    double getCashValue() {
        return cashValue;
    }

    double getMilesValue() {
        return cashValue * 0.0035;
    }
}
