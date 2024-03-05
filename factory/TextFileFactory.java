public class TextFileFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new TextFile();
    }
}

