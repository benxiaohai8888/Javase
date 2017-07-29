import java.util.Scanner;
public class Animal{
	private double weight;//体重
	private int leg;//腿的数量
	private String color;//颜色
	private Animal[] animals;//声明一个数组，用来存储几个动物
	
	public void setWeight(double weight){
		this.weight=weight;
	}
	public double getWeight(){
		return weight;
	}
	public void setLeg(int leg){
		this.leg=leg;
	}
	public int getLeg(){
		return leg;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	
	//初始化动物
	public void initAnimal(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("-----------------请输入动物的信息--------------------");
		animals=new Animal[3];
		int j=1;
		for(int i=0;i<animals.length;i++){
			Animal an=new Animal();
			System.out.println("请输入"+j+"动物的信息:");
			System.out.println("体重:");
			double weight=scanner.nextDouble();
			an.setWeight(weight);
			System.out.println("脚数:");
			int leg=scanner.nextInt();
			an.setLeg(leg);
			System.out.println("颜色:");
			String color=scanner.next();
			an.setColor(color);
			animals[i]=an;
			j++;
		}
		//打印动物信息
		for(int a=0;a<animals.length;a++){
			Animal animal=animals[a];
			System.out.println("第"+(a+1)+"只动物的信息:");
			System.out.println("体重: "+animal.getWeight());
			System.out.println("脚数: "+animal.getLeg());
			System.out.println("颜色: "+animal.getColor());
		}
	}
	public static void main(String[] args){
		Animal an=new Animal();
		an.initAnimal();
	}
}