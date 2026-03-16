public class q7{
    public static void main(String[] args) {
        BankAccount[] arr = new BankAccount[2];
        arr[0] = new SavingAcc(10000);
        arr[1] = new CurrenetAcc(20000);
        for(int i=0; i<arr.length; i++){
            arr[i].calInterest();
        }
    }
}

abstract class BankAccount{
    String name;
    double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    abstract void calInterest();
}

class SavingAcc extends BankAccount{
    SavingAcc(double balance){
        super(balance);
    }

    @Override
    void calInterest(){
        double interest = balance * 0.08;
        System.out.println(interest);
    }
}

class CurrenetAcc extends BankAccount{
    CurrenetAcc(double balance){
        super(balance);
    }

    @Override
    void calInterest(){
        double interest = balance * 0.02;
        System.out.println(interest);
    }
}