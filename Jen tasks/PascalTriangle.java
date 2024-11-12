
public class PascalTriangle{
	public static void main(String[] args){

	/**for(int number = 1; number < 6; number++){
	   for(int num = 1; num < number; num++){
	      for(int numberone = num; numberone 
	     System.out.print(num);
	}
	System.out.println();
   }

}**/

int rows = 5;
	for(int i = 0; i < rows; i++){
		int value = 1;

	  for(int j = 0; j < rows - i; j++){
		System.out.print(" ");
	}

	for(int k = 0; k <= i; k++){
		value = value * (i - k) / (k + 1);

	      System.out.print(value + " ");
}
		System.out.println();
}



}
}