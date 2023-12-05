public interface RBI {
    //in the interfece only the methods
    public String addmoney(int money,String password);
    public String withdrwal(int money,String password);
   public int checkbalance(String password);
    public double calculateintrest(int years);
}
