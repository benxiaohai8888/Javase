import java.util.Scanner;

public class Arrays{

	public static void main(String[] args){ 
		// int[] a=new int[11];
		// 过滤数组 把数组里面元素相同的替换为0
		
		int[] arrays={2,3,4,1,2,3,5};
		int temp=0;//临时存储数据
		//先排序
		for(int i=0;i<arrays.length-1;i++){
			for(int j=i+1;j< arrays.length;j++){
				if(arrays[i] > arrays[j]){
					temp=arrays[i];
					arrays[i]=arrays[j];
					arrays[j]=temp;
				}
			}
		}
		//对排序好的数组进行比较 如果相等则赋值为0
		for(int i=0;i<arrays.length-1;i++){
			for(int j=i+1;j< arrays.length;j++){
				if(arrays[i] == arrays[j]){
					arrays[i]=0;
					arrays[j]=0;
				}
			}
		}
		//输出结果
		for(int i=0;i<arrays.length;i++){
			System.out.print(arrays[i]+" ");
		}
		
	}
}