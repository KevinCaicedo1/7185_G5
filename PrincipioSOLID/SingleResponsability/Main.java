public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Hobbit", "J.R.R. Tolkien", "The Hobbit is a children's fantasy novel written by English author and scholar J.R.R. Tolkien. It is part of the Tolkien canon and a children's fantasy series.");
        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.printTexttoConsole(book);
        bookPrinter.printNameToConsole(book);
    }
    
}
