public class ItemFactory {
    public Item createItem(String itemId, String itemType, String itemName,
                           double startingPrice, String imageURL, String description) {
        if(itemType == null){
            throw new IllegalArgumentException("San pham khong duoc de null");
        }
        switch (itemType) {
            case "Electronics":
                return new Electronics(itemId, itemType, itemName, startingPrice, imageURL, description);
            case "Arts":
                return new Arts(itemId, itemType, itemName, startingPrice, imageURL, description);
            case "Vehicles":
                return new Vehicles(itemId, itemType, itemName, startingPrice, imageURL, description);
            case "OtherItems":
                return new OtherItems(itemId, itemType, itemName, startingPrice, imageURL, description);
            default:
                throw new IllegalArgumentException("San pham khong hop le: " + itemType);
        }
    }
}
