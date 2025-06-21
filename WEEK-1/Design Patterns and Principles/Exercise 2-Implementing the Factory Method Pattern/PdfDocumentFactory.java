
public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public IDocument createDocument() {
        return new PdfDocument();
    }
}
