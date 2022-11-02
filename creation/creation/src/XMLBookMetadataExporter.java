
public class XMLBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter create() {
        try {
            return new XMLBookMetadataFormatter();
        } catch (Exception e) {
            return null;
        }
    }
}
