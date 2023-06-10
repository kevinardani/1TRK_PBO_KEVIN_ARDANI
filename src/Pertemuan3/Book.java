
package Pertemuan3;

public class Book {
    private String title;//menggunakan modified private 
    private String author; //menggunakan modifie private 

    public String getTitle() { //menggunakan get untuk mendapatkan nilai 
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) { //menggunakan set untuk memberikan nilai
        this.author = author;
    }
    
    public void tampilInfo(){
        System.out.println("Judul Buku: "+getTitle());
        System.out.println("Penulis Buku: "+getAuthor());
    }
}
