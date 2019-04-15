package service;

import java.util.ArrayList;

import model.order;

public class BookNumToOrder {
	public ArrayList to(String []bookList){
		ArrayList al=new ArrayList();
		String book_id;
		int book_num,s=0;
		for(int i=0;i<bookList.length;i++){
			book_id=bookList[i];
			book_num=1;
			if(book_id.equals(""))
				continue;
			for(int n=i+1;n<bookList.length;n++){
				if(bookList[n].equals(book_id)){
					book_num++;
					bookList[n]="";
				}
			}
			order o=new order(book_id,book_num);
			al.add(o);
		}
		book_num=al.size();
		return al;
	}
	public ArrayList get(ArrayList al){
		ArrayList a=new ArrayList();
		return a;
	}
}
