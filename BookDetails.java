import java.util.*;
import java.io.*;
class BookDetails{
	public static void main(String args[]){
		String t,a;
		double p;
		int np,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of books");
		n=sc.nextInt();
		Book b[]=new Book[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the title of the books:");
			t=sc.next();
			System.out.println("Enter the author of the books:");
			a=sc.next();
			System.out.println("Enter the price of the books:");
			p=sc.nextDouble();
			System.out.println("Enter the number of pages of the books:");
			np=sc.nextInt();
			b[i]=new Book();
			b[i].setTitle(t);
			b[i].setAuthor(a);
			b[i].setPrice(p);
			b[i].setPages(np);

}
		System.out.println("Title \t Author \t price \t pages \n");
for(int i=0;i<n;i++){
System.out.println(b[i]);
}
}
}
class Book{
String title,author;
double price;
int num_pages;
Book(){
  	title="Default";
	author="Default";
	price=0.0;
	num_pages=0;
}
	void setTitle(String t){
	title=t;
}
	void setAuthor(String a){
	author=a;
}	
	void setPrice(double p){
	price=p;
}
	void setPages(int np){
	num_pages=np;
}
	public String toString(){
	return title+"\t"+author+"\t"+price+"\t"+num_pages+"\n";
}
}
