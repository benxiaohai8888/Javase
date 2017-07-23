import java.util.Random;
public class TestArrays1{
	public static void main(String[] args){ 
		//随机给二维数组赋值,打印输出每个元素
		Random random=new Random();
		int rand=0;//存储随机数
		int[][] arrays=new int[3][4];//声明二维数组
		//给数组赋值
		for(int i=0;i<arrays.length;i++){
			for(int j=0;j<arrays[i].length;j++){
				rand=random.nextInt(100);//在0-100内随机生成一个正整数
				arrays[i][j]=rand;
			}
		}
		//打印输出(采用for循环)
		System.out.println("采用for循环: ");
		for(int i=0;i<arrays.length;i++){
			for(int j=0;j<arrays[i].length;j++){
				System.out.print(arrays[i][j]+" ");
			}
		}
		//打印输出(采用增强for循环)
		System.out.println();//换行
		System.out.println("采用for循环: ");
		for(int[] a:arrays){
			for(int b:a){
				System.out.print(b+" ");
			}
		}
	}
}