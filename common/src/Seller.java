import java.util.ArrayList;

public class Seller extends User{
    private int totalSold;
    //List<Item> listItem = new ArrayList<>();
    private double revenue;
    private int ratings;
    public Seller (String accountName, String passWord,String email, String phoneNumber){
        super(accountName, passWord, email, phoneNumber);
    }

}
