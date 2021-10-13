package Simple;

public class GBP extends Currency{
    @Override
    public void toEgp() {
        System.out.println("The equivalent EGP is: "+getAmount()*21.37);

    }

    @Override
    public void toUsd() {
        System.out.println("The equivalent USD is: "+getAmount()*1.36);
    }

    @Override
    public void toEuro() {
        System.out.println("The equivalent Euro is: "+getAmount()*1.18);

    }

    @Override
    public void toGbp() {
        System.out.println("The equivalent GBP is: "+getAmount());

    }
}
