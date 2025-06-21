
public class WordDocumentFactory extends DocumentFactory {
    @Override
    public IDocument createDocument() {
        return new WordDocument();
    }
}
