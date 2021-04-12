public class Book{
      private String author;
      private String title;
      private int pages;

      public Book(String bookAuthor, String bookTitle){
        author = bookAuthor;
        title = bookTitle;
      }

      public void printAuthor(){
        System.out.println("Author: " + author);
      }

      public void printTitle(){
        System.out.println("Title: " + title);
      }

     

      public Book(String bookAuthor, String bookTitle, int bookPages){
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
      }

      public int getPages(){
        return pages;
      }

     
      private String refNumber;

      public Book(String refNumber){
        refNumber = "";
      }

      public String getRefNumber(){
        return refNumber;
      }

      public void setRefNumber(String ref){
          if (ref.length() >= 3){
            refNumber = ref;
          }
          else {
            System.out.println("Error, the refernce line must contain three charechters at least.");
          }
      }

        private int borrowed;

       public void borrow(){
          borrowed++;
       }

       public int getBorrowed(){
          return borrowed;
       }

        public void printDetails(){
          System.out.println("Author: " + author);
          System.out.println("Title: " + title);
          System.out.println("Pages: " + pages);
          System.out.println("Borrowed: " + borrowed);
          String refPrint; 
        if (refNumber.length() > 0 ) {
          refPrint = refNumber;
        }
        else {
          refPrint = "ZZZ";
        }
        System.out.println("Reference number: " + refPrint);
       }
        
        
        
}
