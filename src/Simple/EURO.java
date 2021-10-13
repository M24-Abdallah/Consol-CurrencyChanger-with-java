package Simple;

public class EURO extends Currency{


    @Override
    public void toEgp() {
        System.out.println("The equivalent EGP is: "+getAmount()*18.15);
    }

    @Override
    public void toUsd() {
        System.out.println("The equivalent USD is: "+getAmount()*1.16);

    }

    @Override
    public void toEuro() {
        System.out.println("The equivalent Euro is: "+getAmount());

    }

    @Override
    public void toGbp() {
        System.out.println("The equivalent GBP is: "+getAmount()*0.85);

    }
}
