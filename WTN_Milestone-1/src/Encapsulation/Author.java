package Encapsulation;
public class Author {
	  private String name;
	  private String email;
	  private char gender;
	  Author(String name,String email,char gender){
	    this.name=name;
	    this.email=email;
	    this.gender=gender;
	  }
	  public void getAuthor() {
		    System.out.println("Author Name: "+name);
		    System.out.println("Author email: "+email);
		    System.out.println("Author gender: "+gender);
		 
		}
	}

class Book{
	  private String Bname;
	  Book(String Bname)
	  {this.Bname=Bname;}
	  public String getBname() 
	  {return Bname;}
	  public double getPrice() 
	  {return price;}
	public void setPrice(double price) 
	{this.price = price;}
	public int getQtyInStock() 
	{return qtyInStock;}
	public void setQtyInStock(int qtyInStock) 
	{this.qtyInStock = qtyInStock;}
	private double price;
	private int qtyInStock;
}

class AuthorMain{  
	public static void main(String[] args) {
	  Book b=new Book("Maha Prasthanam");
	  Author a=new Author("Sri Sri","Srirangam_Srinivasa_Rao@gmail.com",'M');
	  b.setPrice(1500.50);
	  b.setQtyInStock(500);
	  a.getAuthor();
	  System.out.println("Book Name:"+b.getBname()+"\n"+"Price:"+b.getPrice()+"\n"+"Quantity:"+b.getQtyInStock()); 	  
	}
	}