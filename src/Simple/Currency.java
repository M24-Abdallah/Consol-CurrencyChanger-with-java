package Simple;

public abstract class Currency implements Changeable {

    double amount;

    public Currency() {
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }


}

