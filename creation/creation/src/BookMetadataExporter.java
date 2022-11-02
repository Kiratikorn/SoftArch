
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public abstract BookMetadataFormatter create();
    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see fit
        BookMetadataFormatter bookFormat = create();
        for (Book book : books) {
            bookFormat.append(book);
        }
        stream.println(bookFormat.getMetadataString());
    }
}
