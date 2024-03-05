// Document interface representing the product
interface Document {
    void create();  // Common method to create a document
    void open();
}

// TextFile class implementing the Document interface
class TextFile implements Document {
    @Override
    public void create() {
        System.out.println("Text file created.");
        // Additional text file creation logic can be added here
    }

    @Override
    public void open() {
        System.out.println("Text file opened.");
        
    }

}

// CSVFile class implementing the Document interface
class CSVFile implements Document {
    @Override
    public void create() {
        System.out.println("CSV file created.");
        // Additional CSV file creation logic can be added here
    }
    @Override
    public void open() {
        System.out.println("CSV file opened.");
        
    }
}

// DocumentFactory interface representing the creator
interface DocumentFactory {
    Document createDocument();  // Factory method to create a document
}

// TextFileFactory class implementing DocumentFactory interface
class TextFileFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new TextFile();
    }
}

// CSVFileFactory class implementing DocumentFactory interface
class CSVFileFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new CSVFile();
    }
}

// Client code using the Factory Method pattern
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
