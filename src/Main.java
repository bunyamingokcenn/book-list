import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Anna Karenina", 864, "Tolstoy", "1877"));
        books.add(new Book("Jane Eyre", 532, "Charlotte Bronte", "1847"));
        books.add(new Book("Emma", 474, "Jane Austen", "1815"));
        books.add(new Book("David Copperfield", 928, "Charles Dickens", "1850"));
        books.add(new Book("Wuthering Heights", 416, "Emily Bronte", "1847"));
        books.add(new Book("Crime and Punishment", 576, "Fyodor Dostoevsky", "1866"));
        books.add(new Book("Madame Bovary", 329, "Gustave Flaubert", "1857"));
        books.add(new Book("Oliver Twist", 368, "Charles Dickens", "1838"));
        books.add(new Book("Codex Atlanticus", 1100, "Leonardo da Vinci", "1478-1519"));
        books.add(new Book("Middlemarch", 880, "George Eliot", "1871"));

        Map<String, String> bookListMap = new TreeMap<>();

        books.forEach(b -> bookListMap.put(b.getBookName(), b.getAuthorName()));

        System.out.println("Kitaplar;");
        bookListMap.forEach((bookName, authorName) -> System.out.println("Kitap adı: " + bookName + " Yazar Adı: " + authorName));

        List<Book> newList = books.stream().filter(b -> b.getPageNumber() > 100).toList();
        System.out.println();
        System.out.println("Sayfa sayısı 100'den büyük olan kitaplar;");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-35s%-25s%-25s%-25s%-25s", "| Kitap Adı |" , "| Yazar Adı |" , "| Sayfa Sayısı |" , "| Yayın tarihi", "|");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        newList.forEach(b -> System.out.printf("%-36s%-26s%-25s%-25s\n", b.getBookName() , b.getAuthorName() ,  b.getPageNumber() , b.getPublishDate()));
        System.out.println("---------------------------------------------------------------------------------------------------------------");

    }
}