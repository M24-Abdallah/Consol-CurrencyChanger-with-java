package Simple;

public abstract class Currency {

    double amount;

    public Currency() {
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public abstract void toEgp();
    public abstract void toUsd();
    public abstract void toEuro();
    public abstract void toGbp();

}

