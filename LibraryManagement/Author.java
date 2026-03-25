
package LibraryManagement;

public class Author extends Book{
    String name;
    String bio;

    public Author(String title,int publicationYear,String name,String bio){
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }

    public void displayDetails(){
        System.out.println("-----Book's Information-----");
        System.out.println("Title : "+title);
        System.out.println("year of Publication : "+publicationYear);
        System.out.println("-----Author's Information-----");
        System.out.println("Name : "+name);
        System.out.println("Bio : "+bio);
    }
}
