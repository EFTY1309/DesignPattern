public class Client {
    public static void main(String[] args) {
        // Using TextFileFactory to create a TextFile
        DocumentFactory textFileFactory = new TextFileFactory();
        Document textFile = textFileFactory.createDocument();
        textFile.create();
        textFile.open();

        // Using CSVFileFactory to create a CSVFile
        DocumentFactory csvFileFactory = new CSVFileFactory();
        Document csvFile = csvFileFactory.createDocument();
        csvFile.create();
        csvFile.open();
    }
}