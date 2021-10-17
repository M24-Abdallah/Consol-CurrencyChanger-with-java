package Simple;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
    Scanner get =new Scanner(System.in);

    //Make instance of EGP  as default
	Currency c = new EGP();

	byte chosenNumber;
        System.out.println("----Welcome to Currency Changer-----\n");
        System.out.println("Choose your current currency");
        System.out.println("1-EGP\n2-USD\n3-EURO\n4-GBP");
        chosenNumber=get.nextByte();
        switch (chosenNumber){
            case 1:
                c=new EGP();
                break;
            case 2:
                c=new USD();
                break;
            case 3:
                c=new EURO();
                break;
            case 4:
                c=new GBP();
                break;
            default :
        }
        System.out.println("Enter the currency amount:");
        double amount=get.nextDouble();

        c.setAmount(amount);
        System.out.println("Choose currency to change:");
        System.out.println("1-EGP\n2-USD\n3-EURO\n4-GBP");
        chosenNumber=get.nextByte();
        switch (chosenNumber){
            case 1:
                c.toEgp();
                break;
            case 2:
                c.toUsd();
                break;
            case 3:
                c.toEuro();
                break;
            case 4:
                c.toGbp();
                break;
            default:
        }




    }
}
