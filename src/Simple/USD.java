package Simple;

public class USD extends Currency implements Changeable {
    @Override
    public void toEgp() {
        System.out.println("The equivalent EGP is: "+getAmount()*15.70);
    }

    @Override
    public void toUsd() {
        System.out.println("The equivalent USD is: "+getAmount());
    }

    @Override
    public void toEuro() {
        System.out.println("The equivalent Euro is: "+getAmount()*0.87);

    }

    @Override
    public void toGbp() {
        System.out.println("The equivalent GBP is: "+getAmount()*0.73);
    }
}
