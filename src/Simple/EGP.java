package Simple;

public class EGP extends Currency{
    @Override
    public void toEgp(){
        System.out.println("The equivalent EGP is: "+getAmount());
    }

    @Override
    public void toUsd() {
        System.out.println("The equivalent USD is: "+getAmount()/15.70);
    }

    @Override
    public void toEuro() {
        System.out.println("The equivalent Euro is: "+getAmount()/18.15);

    }

    @Override
    public void toGbp() {
        System.out.println("The equivalent GBP is: "+getAmount()/21.37);

    }
}
