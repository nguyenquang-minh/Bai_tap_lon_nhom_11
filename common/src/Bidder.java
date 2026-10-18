import java.util.ArrayList;
import java.util.List;

public class Bidder extends User{
    private int totalwin;
    private double balance;
    private double totalSpent;
    List<String> joinedAuction = new ArrayList<>();
    List<String> itemWin = new ArrayList<>();
    public Bidder (String accountName, String passWord,String email, String phoneNumber){
        super(accountName, passWord, email, phoneNumber);
    }
//    public Boolean placeBid(String auctionId, double bidAmount){
//
//    }
}
