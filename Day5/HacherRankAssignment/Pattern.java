import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    
    int n=arr.size();
    int tempSize=3;
    ArrayList<Integer> sumArray=new ArrayList<Integer>();
    int totalSum=0,k=0,l=0;
    if(k>n)
    {
        return 0;
    }
    for(int i=0;i<n-tempSize+1;i++)
    {        
        for(int j=0;j<n-tempSize+1;j++)
        {
            totalSum=0;
            for(k=i;k<tempSize+i;k++)
            {
                for(l=j;l<tempSize+j;l++)
                {
                    totalSum=totalSum+arr.get(k).get(l);
                }
            }
           // System.out.println(k+","+l);
            int sum=totalSum-(arr.get(k-2).get(l-3)+arr.get(k-2).get(l-1));
           // System.out.println(sum);
            sumArray.add(sum);             
        }
    }
    //System.out.println(sumArray);
    int max=-99;
    for(int i=0;i<sumArray.size();i++)
    {
        for(int j=0;j<sumArray.size();j++)
        {
            if((sumArray.get(i))>max)
            {
                max=sumArray.get(i);
            }
        }
    }
    return max;

    }

}

public class Pattern {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
