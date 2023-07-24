import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class test {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		// part1
		System.out.println("**ins.");
		int[] arrI = {4,3,2,10,12,1,5,6};
		int[] arrI2 = insertion_sort.insertion_sort(arrI);
		 for(int i=0;i<arrI2.length;i++) {
	     	System.out.println(arrI2[i]);
	     }
		 //part2
		 System.out.println("***merge");
		 int[] arrM = {4,3,2,10,12,1,5,6};
			int[] arrM2 = merge_sort.merge_sort(arrM,0,arrM.length-1);
			 for(int i=0;i<arrM2.length;i++) {
		     	System.out.println(arrM2[i]);
		     }
		
		
		//part3
		 File student = new File("student.txt");
	     Scanner idLineReader = new Scanner(student);
	     
	     int idAmount = 0;
	     while (idLineReader.hasNextLine()) {
	     	idAmount++;
	     	idLineReader.nextLine();
	     }
	     
	     idLineReader.close();
	     
	     student[] idArr = new student[idAmount];
	     int num=0;

	    Scanner idReader = new  Scanner(student);
	     while (idReader.hasNextLine()) {
	    	 
	     	String[] line = idReader.nextLine().split(",");
	     	if(num!=0) {
	     		
	     	student temp = new student(line[0], line[1], Integer.parseInt(line[2]));
	     	idArr[num]=temp;
	     	}
	     	num++;
	     }
	     idReader.close();
	     System.out.println("***MERGE SORT***");
	     System.out.println("NAME     SURNAME       ID");
	     student[] arr3 = merge_sort.merge_sortO(idArr,1,idArr.length-1);
		 for(int i=1;i<arr3.length;i++) {
	     	System.out.println(i+") "+arr3[i].getName()+"  "+arr3[i].getSurname()+"   "+arr3[i].getId());
	     }
		 
		 System.out.println("***INSERTION SORT***");
	     System.out.println("NAME     SURNAME       ID");
	     student[] arr4 = insertion_sort.insertion_sortO(idArr);
		 for(int i=1;i<arr4.length;i++) {
	     	System.out.println(i+") "+arr4[i].getName()+"  "+arr4[i].getSurname()+"   "+arr4[i].getId());
	     }
	     
	}

}
