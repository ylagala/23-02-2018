package HackerRankStringPblmStatements;
/*
 * 
 * 
 * Sample Input

20
0 ab
6 cd
0 ef
6 gh
4 ij
0 ab
6 cd
0 ef
6 gh
0 ij
4 that
3 be
0 to
1 be
5 question
1 or
2 not
4 is
2 to
4 the
Sample Output

- - - - - to be or not to be - that is the question - - - -

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         List<String> list = new ArrayList<>();
         int n2 =  n /2 ;
         for(int i=0; i<n2; i++){
        	 list.add(in.nextInt()  +" -");
        	 in.next();
         }
        for(int a0 =0; a0<n2; a0++){
        	 list.add(in.nextInt() + " " +in.next());  
        }
        list.sort(new Comparator<String>() {
           @Override
        public int compare(String o1, String o2) {
        	return Integer.parseInt(o1.substring(0, 2).trim()) -Integer.parseInt(o2.substring(0, 2).trim());
        }
        	   
           
		});
       
        list.stream().forEach( i -> { System.out.print(i.substring(i.indexOf(' ')+1)+" ");
        });
        
        in.close();
	}

}
