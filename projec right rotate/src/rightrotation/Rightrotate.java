package rightrotation;

public class Rightrotate {

	public static void main(String[] args) {
		 int [] arr = new int [] {5,7,1,6,4};     
	        int n = 3;    
	        System.out.println("Default array: ");    
	        for (int j = 0; j < arr.length; j++) {     
	            System.out.print(arr[j] + " ");     
	        }       
	        for(int i = 0; i < n; i++){    
	            int k, last;    
	            last = arr[arr.length-1];   
	            for(k = arr.length-1; k > 0; k--){    
	                arr[k] = arr[k-1];    
	            }    
	            arr[0] = last;    
	        }    
	        
	        System.out.println();      
	        System.out.println("After right rotation: ");    
	        for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");  
		}
		
		
		
		

	}


}
