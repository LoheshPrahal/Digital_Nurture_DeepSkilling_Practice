public interface Document {
    void message();
}

class WordDocument implements Document{
    @Override
    public void message(){
        System.out.println("Word Document created");
    }
}

class PdfDocument implements Document{
    @Override
    public void message(){
        System.out.println("Pdf Document created");
    }
}