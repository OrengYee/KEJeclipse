package projectA10;

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		this(t,"작자미상");
		
	}
	
	public Book(String title,String author) {
		
		//멤버변수 호출
		this.title = title;
		this.author = author;
		
		//멤버메소드 호출
		this.printTitle();
		
	}
	//멤버 메소드
	public void printTitle() {
		System.out.println(this.title);
	}

	public static void main(String[] args) {
		//인스턴스화
//		Book littlePrice = new Book();
		Book littlePrice = new Book("어린왕자","생택취페리");
		Book loveStory = new Book("춘향전");
		
		System.out.println(littlePrice.title+" 책의 저자는 "+littlePrice.author);
		System.out.println(loveStory.title+" 책의 저자는 "+loveStory.author);


		
		

	}

}
