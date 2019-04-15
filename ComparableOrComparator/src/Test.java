
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.stuList.add(new Student("1","3","4","Alex"));
		Student.stuList.add(new Student("1","2","6","Dile"));
		Student.stuList.add(new Student("1","2","3","Jack"));
		Student.stuList.add(new Student("1","3","4","Mike"));
		Student.stuList.add(new Student("1","6","5","Angle"));
		Student.stuList.add(new Student("1","3","2","Bob"));
		//Student.stuList.addAll(Arrays.asList(stu));
		Collections.sort(Student.stuList,new studentComparator());
		Student.show();
	}

}
