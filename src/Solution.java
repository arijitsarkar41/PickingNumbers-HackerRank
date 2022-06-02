import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static int pickingNumbers(List<Integer> a) 
    {
    	
    	// Counting frequencies of elements  
        HashMap<Integer, Integer> freq = new HashMap<>();  
      
        for(int i = 0; i < a.size(); ++i) 
        {  
            if(freq.containsKey(a.get(i)))  
                freq.put(a.get(i), freq.get(a.get(i)) + 1);  
            else
                freq.put(a.get(i), 1);  
        }  
      
        // Finding max sum of adjacent indices  
        int ans = 0;  
      
        for (Integer key : freq.keySet())  
        {  
            if(freq.containsKey(key+1))  
                ans = Math.max(ans, freq.get(key) + freq.get(key+1));  
        }  
      
        return ans;  
    }  
    	
    	/*//Object[] arr= a.toArray();
    	//int arr[] = new int[a.size()];
    	List<Integer> l=new ArrayList<>(5);
    	int k=0;
    	
    	int count=0;
    	int y=0;
    	//System.out.print(a.get(a.indexOf(1)));
    	
    	for( Integer i:a)
    	{
    		for (j=1;j<a.size();j++)
    			{
    				k= i-a.get(j);
    				y=Math.abs(k);
    				if(y<=1);
    				if(!l.contains(i) || l.indexOf(i) != a.indexOf(i) )
    				l.add(i);
    				else if(l.indexOf(i)!=l.indexOf(j))
    				{
    					l.add(i);
    				}
    				
    			}
    	}
    	
    	count = l.size();*/
    	
    	
    	//return count;

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
