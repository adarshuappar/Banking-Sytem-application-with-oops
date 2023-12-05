public class lotakbank implements RBI{
    private  String username;
    private  Integer accountnu0;
     private  String password;
     private int balance;

       public static  double rateofintrest=7.5;

    public lotakbank(String username, String password,int balance) {
        this.username = username;
        this.password = password;
        this.accountnu0=101;
        this.balance = balance;
    }

    public String addmoney(int money, String password) {

        if(password.equals(this.password)){
            balance = balance+money;
            return "the money had been added,new balance:"+balance;
        }
        else
            return "the password is inncorrect";
    }


    public String withdrwal(int money, String password) {

        if(password.equals(this.password)){


                balance=balance-money;
                return  "Money have been withdrwal sucessfull, new balance is"+balance;



        }
        else
            return "the password is inncorrect";
    }


    public int checkbalance(String password) {

        if(password.equals(this.password)){
            return balance;
        }
        else
            return -1;
    }

    public double calculateintrest(int years) {
        double totalintrest= (balance*rateofintrest*years)/100;
        return totalintrest;
    }
}
