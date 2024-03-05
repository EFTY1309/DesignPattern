public class CSVFileFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new CSVFile();
    }
}