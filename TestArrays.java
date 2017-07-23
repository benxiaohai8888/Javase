import java.util.Random;
public class TestArrays{
	public static void main(String[] args){ 
		//随机生成50个正整数，存放到数组，求出总和，平均值，最大值，最小值
		Random random=new Random();
		int rand=0;
		int[] arrays=new int[50];
		int max=0;//最大值
		int min=0;//最小值
		int sum=0;//总和
		double avg=0.0;//平均值
		
		//生成数组
		 System.out.println("随机生成的数为： ");
		for(int i=0;i<50;i++){
			rand=random.nextInt(50);//在0-50内随机生成一个正整数
			arrays[i]=rand;
			System.out.print(rand+" ");
		}
		//求总和
		 for(int i=0;i<arrays.length;i++){
			sum+=arrays[i];
		 }
		 //求最大值和最小值
		 max=arrays[0];//假设第一个值为最大值
		 for(int i=0;i<arrays.length;i++){	
				if(arrays[i]>max){
					 max=arrays[i];
				}else{
					min=arrays[i];
			 }
		 }
		 
		 avg=sum/arrays.length;//计算平均值
		  System.out.println();//换行
		 System.out.println("总和： "+sum);
		 System.out.println("平均值： "+avg);
		 System.out.println("最大值： "+max);
		 System.out.println("最小值： "+min);
		
	}
}