package one;

public class Bubble {
	public void bubbleSort(int data[]){
		int temp=0;
		
		for(int i=0; i<=data.length-1;i++) {
			for(int j=0;j<=data.length-2;j++)
				if(data[j]>data[j+1]) {
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
		}
	}
	public static void main(String[] args) {
		
		Bubble bubble = new Bubble();
		int data[] = {5,12,66,22,15};
		bubble.bubbleSort(data);
		
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
	}
}
