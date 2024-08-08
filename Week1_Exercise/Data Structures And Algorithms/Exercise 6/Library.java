import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<LibraryBook> collection;

    public Library() {
        this.collection = new ArrayList<>();
    }

    public void addBook(LibraryBook book) {
        collection.add(book);
        // Optional: Sort the collection to prepare for binary search
        Collections.sort(collection, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
    }

    public LibraryBook findByTitleLinear(String title) {
        for (LibraryBook book : collection) {
            if (book.getName().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public LibraryBook findByTitleBinary(String title) {
        int start = 0;
        int end = collection.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            LibraryBook midBook = collection.get(mid);

            if (midBook.getName().equals(title)) {
                return midBook;
            } else if (midBook.getName().compareTo(title) < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return null;
    }
}
