package tt;

import java.util.List;

public class people {
	private String username;
	private String password;
	private List<people> bookList;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<people> getBookList() {
		return bookList;
	}
	public void setBookList(List<people> bookList) {
		this.bookList = bookList;
	}
	//	private List<String> bookList;
//	public List<String> getBookList() {
//		return bookList;
//	}
//	public void setBookList(List<String> bookList) {
//		this.bookList = bookList;
//	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
