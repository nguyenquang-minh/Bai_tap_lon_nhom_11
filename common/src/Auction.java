import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Auction {
    private String auctionId;
    private Item item;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double currentPrice;
    private double bidInCrease;
    private Bidder highestBidderAccount;
    private AuctionStatus status;
    private List<Bidder> Obversers = new ArrayList<>();

    public Auction(String auctionId, Item item, LocalDateTime startTime, LocalDateTime endTime,
                   double currentPrice, double bidInCrease, Bidder highestBidderAccount,AuctionStatus status,
                   List<Bidder> obversers) {
        this.auctionId = auctionId;
        this.item = item;
        this.startTime = startTime;
        this.endTime = endTime;
        this.currentPrice = currentPrice;
        this.bidInCrease = bidInCrease;
        this.highestBidderAccount = highestBidderAccount;
        this.status = status;
        Obversers = obversers;
    }

    public AuctionStatus getStatus() {
        return status;
    }

    public void startAuction() {
        if (status != AuctionStatus.OPEN) {
            throw new IllegalStateException("KHONG THE DAU GIA KHI CHUA OPEN");
        }
        LocalDateTime now = LocalDateTime.now();
        if (now.isBefore(startTime)) {
            throw new IllegalStateException("CHUA DEN THOI GIAN BAT DAU");
        }
        if (!now.isBefore(endTime)) {
            throw new IllegalStateException("THOI GIAN DA KET THUC");
        }
        status = AuctionStatus.RUNNING;
    }
    public String placeBid(String bidderId,double bidAmount){
        if(status!=AuctionStatus.RUNNING){
            throw new IllegalStateException("PHIEN DAU GIA CHUA CHAY");
        }
        LocalDateTime now = LocalDateTime.now();
        if(now.isBefore(startTime) || !now.isBefore(endTime)){
            throw new IllegalStateException("KHONG TRONG THOI GIAN DAU GIA");
        }
        if(bidderId == null){
            throw new IllegalArgumentException("NGUOI DAT GIA KHONG HOP LE");
        }
        if(bidAmount < currentPrice + bidInCrease){
            //chua xong
        }
    }
}
