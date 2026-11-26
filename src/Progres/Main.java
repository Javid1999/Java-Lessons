package Progres;

public class Main {
    public static void main(String[] args) {
       // DivideCalculator  divideCalculator = new DivideCalculator();
        //System.out.println(divideCalculator.calculate(5,0));
    Transfer transfer = new Transfer("ALI","VALI",-1);
    TransferValidator transferValidator = new TransferValidator();
    boolean result = transferValidator.validate(transfer);
        System.out.println(result);
        System.out.println(transferValidator.validate(transfer));
    }
}