
public class ordenamiento {

	public void seleccion(int[]arr)

	{
		int pivote=0;
		int temp=0;
		int aux=0;
		int min=0;
		
		for(pivote=0; pivote<arr.length; pivote++) {
			min=pivote;
			for(aux=pivote+1;aux<arr.length;aux++) {
				if(arr[aux]<arr[min]) {
					min=aux;
				}
			}
			
		if(min!=pivote) {
			temp=arr[pivote];
			arr[pivote]=arr[min];
			arr[min]=temp;
			}
		}
	}
	
	public void imprimir(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
		
	}
	
}


