package 学生成绩排序;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []score1={88.4,90.8,54.9};
		Student st1=new Student("1","Mike",score1);
		Student.stu.add(st1);
		double []score2={40.6,55.7,59.9};
		Student st2=new Student("2","Jake",score2);
		Student.stu.add(st2);
		double []score3={86.9,97.2,98};
		Student st3=new Student("3","Alex",score3);
		Student.stu.add(st3);
		double []score4={88.7,43.4,28.0};
		Student st4=new Student("4","Alice",score4);
		Student.stu.add(st4);
		Student.sortByAverage();
		Student.show();
		Student.check();
	}

}
