import java.util.Scanner;

public class Test2{
	public static void main(String[] args){
		//基本数据类型
		//byte short char int double float boolean long
		// byte h=1;
		// int a=0;
		// short b=0;
		// char c='a';
		// double d=19.999d;
		// boolean g=true;
		// long e=9999L;
		// float f=9.9f;
		
		// System.out.println("---->>"+a);
		// System.out.println("---->>"+b);
		// System.out.println("---->>"+c);
		// System.out.println("---->>"+d);
		// System.out.println("---->>"+e);
		// System.out.println("---->>"+f);
		// System.out.println("---->>"+g);
		// System.out.println("---->>"+h);
		
		// 求1到100之间能别3整除，并且能被7整除的数：
		// System.out.println("for循环: ");
		// for(int i=1;i<=100;i++){
			// if(i%3==0 && i%7==0){
				// System.out.print(i+ " ");
			// }
		// }
		// System.out.println();
		// System.out.println("while循环: ");
		// int i=1;
		// while(i<=100){
			// if(i%3==0 && i%7==0){
				// System.out.print(i+" ");
			// }
			// i++;
		// }
		// System.out.println();
		// System.out.println("do-while循环: ");
		// int j=1;
		// do{
			// if(j%3==0 && j%7==0){
				// System.out.print(j+ " " );
			// }
			// j++;
		// }while(j<=100);
		
		//计算用户输入的年  月 距离 1900年1月多少天
		System.out.println();
		System.out.println("计算用户输入的年  月 距离 1900年1月多少天");
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入年：");
		int year=scanner.nextInt();
		System.out.println("请输入月：");
		int month=scanner.nextInt();
		
		int day=0;//天数
		int a=1900;
		
		if(year >=1900){
			//先计算年的天数
			while(a<year){
				if((a%4==0 && a%100!=0) || a%400==0){
					day+=366;
				}else{
					day+=365;
				}
				a++;
			}
			//后计算月的天数
			if(month>=1 && month<=12){
				for(int i=1;i< month;i++){
					if(month == 4 || month == 6 || month == 9 ||month == 11){
						day+=30;
					}else if(month == 2){
						if((year%4==0 && year%100!=0) || year%400==0){
							day+=29;
						}else{
							day+=28;
						}
					}else{
						day+=31;
					}					
				}				
			}else{
				System.out.println("请输入正确的月份！");
			}
			System.out.println(year+" 年距离1900年1月有 "+day+" 天");	
		}else{
			System.out.println("请输入大于1900年的年份！");
		}
		
		
	}
}