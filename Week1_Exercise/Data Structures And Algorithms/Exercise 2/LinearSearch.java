public class LinearSearch {
    public static Item findItem(Item[] itemList, String searchName) {
        for (Item item : itemList) {
            if (item.getItemName().equalsIgnoreCase(searchName)) {
                return item;
            }
        }
        return null; // Return null if the item is not found
    }
}
