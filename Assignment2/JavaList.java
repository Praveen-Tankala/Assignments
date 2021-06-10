//problem statement :For the Java List 
/*
For this problem, we have 2 types of queries you can perform on a List:

Insert y at index x:

Insert
x y
Delete the element at index :

Delete
x


Given a list L, N, of Q integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer , N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers xy, and the value y must be inserted into L at index x.
If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.
Constraints
1<=N<=4000
1<=Q<=4000



Each element in is a 32-bit integer.
Output Format

Print the updated list L as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
*/
//Solution:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();//read the size of arraylist
        List<Integer> l=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            l.add(i,s.nextInt());//inserting at the index of i
            
        }
        int x=s.nextInt();//read the no of queries
        for(int j=0;j<x;j++){
           String b=s.next();//read the operation "insert " || "delete"
         //  int k=s.nextInt();
         //if insert the read the index and the value to insert
            if(b.equals("Insert")){
               // int c=s.nextInt();
               // int d=s.nextInt();
                l.add(s.nextInt(),s.nextInt());//adding the index and the value to the list 
            }
            //if the command is delete 
            else{
               // int e=s.nextInt();
               //read the element to delete 
               //we directly did that here
                l.remove(s.nextInt());}
            
            }
            for(Integer val:l){
                //printing the final list using for each loop
            System.out.print(val+" ");
        }
        }
        catch(Exception e){}//just to handle the unnessary exceptions
        
        
    }
}
