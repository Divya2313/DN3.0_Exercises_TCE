public class LibraryBook {
    private int id;
    private String name;
    private String writer;

    public LibraryBook(int id, String name, String writer) {
        this.id = id;
        this.name = name;
        this.writer = writer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWriter() {
        return writer;
    }

    @Override
    public String toString() {
        return String.format("Book ID: %d, Title: '%s', Author: '%s'", id, name, writer);
    }
}
