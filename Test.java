import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		//打印乘法表
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();//换行
		}	
	}
}
