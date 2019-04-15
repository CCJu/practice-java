import java.util.Comparator;

public class newCompartor implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		int result;
		result=s1.getYear().compareTo(s2.getYear());
		if(result==0) result=s1.getGrade().compareTo(s2.getGrade());
		if(result==0) result=s1.getNum().compareTo(s2.getNum());
		return result;
	}
}

