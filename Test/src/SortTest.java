import java.util.Collections;
public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.al.add(new Student("1","3","4","Alex"));
		Student.al.add(new Student("1","2","6","Dile"));
		Student.al.add(new Student("1","2","3","Jack"));
		Student.al.add(new Student("1","3","4","Mike"));
		Student.al.add(new Student("1","6","5","Angle"));
		Student.al.add(new Student("1","3","2","Bob"));
		//Student.stuList.addAll(Arrays.asList(stu));
		Collections.sort(Student.al,new newCompartor());
	}

}
