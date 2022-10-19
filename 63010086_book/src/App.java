import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Output output = new Output();
        Book book1 = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        output.printToFile(book1);

        Book book2 = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        output.printToScreen(book2);
    }
}
