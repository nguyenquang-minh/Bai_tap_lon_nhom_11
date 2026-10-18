import java.time.LocalDateTime;

public class Bid {
    private String bidId;//mã lượt đặt
    private String auctionId;
    private String bidderId;
    private double amount;
    private LocalDateTime timeStamp;

    public Bid(String bidId, String auctionId, String bidderId, double amount, LocalDateTime timeStamp) {
        this.bidId = bidId;
        this.auctionId = auctionId;
        this.bidderId = bidderId;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getBidderId() {
        return bidderId;
    }
    public boolean isValidBid(double currentPrice,double minimumStep){

    }
}
