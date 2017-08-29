package one;

public class Desc {
	public static void main(String[] args) {
		int tem=0;
		int num[] = {20,17,2,5,11};
		for(int i=0;i<=4; i++)
			for(int j=0;j<=3;j++)
			{
				if(num[j]<num[j+1]){
					tem=num[j];
					num[j]=num[j+1];
					num[j+1]=tem;
				}
			}
		for(int i=0;i<=4;i++){
			System.out.println(num[i]);
			
		}
	}
}
