public class Main {
    public static void main(String[] args) {
        // Initialize the inventory with items
        Item[] inventory = new Item[] {
                new Item(1, "Item A", "Category A"),
                new Item(2, "Item B", "Category B"),
                new Item(3, "Item C", "Category C"),
                new Item(4, "Item D", "Category D"),
                new Item(5, "Item E", "Category E")
        };

        // Sort the inventory by item name
        java.util.Arrays.sort(inventory,
                (firstItem, secondItem) -> firstItem.getItemName().compareTo(secondItem.getItemName()));

        // Perform linear search
        String searchName = "Item C";
        Item linearSearchResult = SimpleSearch.findItem(inventory, searchName);
        if (linearSearchResult != null) {
            System.out.println("Linear Search: Found " + linearSearchResult.getItemName());
        } else {
            System.out.println("Linear Search: Item not found");
        }

        // Perform binary search
        Item binarySearchResult = InventorySearch.findItemByName(inventory, searchName);
        if (binarySearchResult != null) {
            System.out.println("Binary Search: Found " + binarySearchResult.getItemName());
        } else {
            System.out.println("Binary Search: Item not found");
        }
    }
}
