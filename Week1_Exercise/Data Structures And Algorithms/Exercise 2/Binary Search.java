public class BinarySearch {
    public static Item findItemByName(Item[] items, String name) {
        int start = 0;
        int end = items.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2; // Prevents overflow
            String currentName = items[middle].getItemName();

            if (currentName.equals(name)) {
                return items[middle];
            } else if (currentName.compareTo(name) < 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return null; // If the item is not found
    }
}
