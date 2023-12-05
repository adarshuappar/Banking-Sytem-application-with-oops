import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the username");
        String username= sc.next();
        System.out.println("Enter the initial amount");
        int intialbalnce= sc.nextInt();

        System.out.println("Enter the password");
        String password= sc.next();

        nobank bankaccount = new nobank(username, password, intialbalnce);

        //withdrwal
        System.out.println("Enter the amount to be withdrwal");
        int money = sc.nextInt();
        System.out.println("Enter the password");
        String ewpass= sc.next();
        String response = bankaccount.withdrwal(money,ewpass);
        System.out.println(response);
// addmoney

        System.out.println("Enter the amount to be added");
        int amount = sc.nextInt();
        System.out.println("Enter the password");
        String apass= sc.next();
        String aresponse = bankaccount.addmoney(amount,apass);
        System.out.println(aresponse);
        if(aresponse.equals("the password is inncorrect"))
        {
            System.out.println(aresponse);
            System.out.println("enter the correct password");
            apass=sc.next();
            aresponse = bankaccount.addmoney(amount,apass);
            System.out.println(aresponse);

        }
        System.out.println("Enter the password to view the balance");
        String wpass=sc.next();
        int wresponse=bankaccount.checkbalance(wpass);
        System.out.println(wresponse);
        System.out.println("Enter the how many years for the intrest");
        int year=sc.nextInt();
        double intrest=bankaccount.calculateintrest(year);
        System.out.println(intrest);

    }
}
