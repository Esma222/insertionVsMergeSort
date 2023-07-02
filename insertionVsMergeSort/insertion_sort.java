
public class insertion_sort {

	static student[] insertion_sortO(student arr[]) 
    { 
        int n = arr.length; 
        for (int i = 2; i < n; ++i) { 
            student key = arr[i]; 
            int j = i - 1; 
              
            while (j >= 0 && arr[j].getId() > key.getId()) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
       return arr;
    }
	static int[] insertion_sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
              
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
       return arr;
    }
}
