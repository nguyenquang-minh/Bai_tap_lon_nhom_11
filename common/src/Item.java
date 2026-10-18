
public class Item {
    private String itemId;
    private String itemType;
    private String itemName;
    private double startingPrice;
    private String imageURL;
    private String description;

    public Item(String itemId, String itemType, String itemName, double startingPrice, String imageURL, String description) {
        this.itemId = itemId;
        this.itemType = itemType;
        this.itemName = itemName;
        this.startingPrice = startingPrice;
        this.imageURL = imageURL;
        this.description = description;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
