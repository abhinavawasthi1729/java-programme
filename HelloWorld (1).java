 class BubbleSort{					//this class name explains the whole programme :) 

	public static void main(String args[]){
	int a[]={1,4,3,2,5,7,6,9,10,8};
	for(int i=0;i<a.length-1;i++){                  
		for(int j=i;j<a.length-1;j++){		//j should begin with j=i
			if(a[j]>a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}  
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"\n");	
	}  

   }

}
