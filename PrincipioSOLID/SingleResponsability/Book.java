public class Book {

    private String name;
    private String author;
    private String text;
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    //constructor, getters and setters
    Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }
    // methods that directly relate to the book properties
    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
}