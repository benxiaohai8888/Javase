import java.util.Scanner;
public class Student{
	private  String name;//姓名
	private  int age;//年龄
	private  double score;//分数
	//定义全局的变量
	private Student[] students;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	
	public void setScore(double score)
	{
		this.score=score;
	}
	public double getScore(){
		return score;
	}
	
	//初始化学生
	public void initStudent(){
		Scanner scanner=new Scanner(System.in);
		students=new Student[3];
		System.out.println("--------输入3个学生的信息--------");
		int j=1;
		for(int i=0;i<students.length;i++){
		
			Student stu=new Student();	
			
			System.out.println("输入第["+j+"]个学生的信息:");
			System.out.println("姓名:");
			stu.setName(scanner.next());	
			
			System.out.println("年龄:");
			stu.setAge(scanner.nextInt());	
			
			System.out.println("分数:");
			stu.setScore(scanner.nextDouble());	
			
			students[i]=stu;		
			j++;
		}
		//打印输出
		for(int a=0;a<students.length;a++){
			Student stu=students[a];
			System.out.println("第["+(a+1)+"]个学生的姓名："+stu.getName());
			System.out.println("第["+(a+1)+"]个学生的年龄："+stu.getAge());
			System.out.println("第["+(a+1)+"]个学生的分数："+stu.getScore());
			System.out.println("----------------------------------------");
		}
	}
	
	//总分
	public double sumScore(){
		double sumScore=0.0;		
		for(int a=0;a<students.length;a++){
			Student stu=students[a];
			sumScore+=stu.getScore();
		}
		return sumScore;
	}
	
	//平均分
	public double avgScore(){
		return sumScore()/students.length;
	}

	//最大值
	public double max(){
		double max=students[0].getScore();		
		for(int a=0;a<students.length;a++){
			if(students[a].getScore()>max){
				max=students[a].getScore();
			}
		
		}
		return max;
		
	}
	//最大值的学生
	public Student maxStudent(){
		double max=students[0].getScore();	
		int index=-1;
		for(int a=0;a<students.length;a++){
			if(students[a].getScore()>max){
				max=students[a].getScore();
				index=a;
			}
		
		}
		return students[index];
		
	}
	//最小值
	public double min(){
		double min=students[0].getScore();		
		for(int a=0;a<students.length;a++){
			if(students[a].getScore()<min){
				min=students[a].getScore();
			}
		
		}
		return min;
		
	}
	//最小值的学生
	public Student minStudent(){
		double min=students[0].getScore();	
		int index=-1;
		for(int a=0;a<students.length;a++){
			if(students[a].getScore()<min){
				min=students[a].getScore();
				index=a;
			}else{
				min=students[0].getScore();
				index=0;
			}
		
		}
		return students[index];
		
	}
	//排序
	public void sort(){
		Student st=new Student();
		for(int i=0;i<students.length-1;i++){
			for(int j=i+1;j<students.length-1;j++){
				if(students[i].getScore() > students[j].getScore()){
					st=students[i];
					students[i]=students[j];
					students[j]=st;
				}
			}
		}
		
		for(Student s: students){
			System.out.print("姓名："+s.getName()+" ");
			System.out.print("年龄："+s.getAge()+"  ");
			System.out.print("分数："+s.getScore()+"  ");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args){
		Student stu=new Student();
		//初始化学生
		stu.initStudent();
		//总分
		System.out.println("总分： "+stu.sumScore());
		//平均分
		System.out.println("平均分: "+stu.avgScore());
		//分数最大值
		System.out.println("最大值: "+stu.max());
		//分数最大值的学生信息
		System.out.println("分数最大值的学生姓名: "+stu.maxStudent().getName());
		//分数最小值
		System.out.println("最小值: "+stu.min());
		//分数最小值的学生信息
		System.out.println("分数最小值的学生姓名: "+stu.minStudent().getName());
		//排序
		System.out.println("排序结果； ");
		stu.sort();
		
		
	}
}
