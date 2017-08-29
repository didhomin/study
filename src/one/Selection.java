package one;

public class Selection {

	public void select(int[] index) {
		int min,tem;
		for(int i=0; i<index.length; i++) {
			min = i;
			for(int j=i+1;j<index.length;j++)
				if(index[min]>index[j])
					min=j;
			tem=index[i];
			index[i]=index[min];
			index[min]=tem;
		}
	}
	
	public static void main(String[] args) {
		int data[] = {53,2,5,12,22};
		
		Selection selection = new Selection();
		selection.select(data);
		
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
	}
}
