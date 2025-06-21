
public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public IDocument createDocument() {
        return new ExcelDocument();
    }
}
