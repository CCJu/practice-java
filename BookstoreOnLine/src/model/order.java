package model;

public class order {
	private String book_id;
	private int book_num;
	public order(String book_id,int book_num){
		this.book_id=book_id;
		this.book_num=book_num;
	}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public int getBook_num() {
		return book_num;
	}
	public void setBook_num(int book_num) {
		this.book_num = book_num;
	}
	
}
