import java.util.*;
class sieve_atkin_v4{
 
    public static void main(String args[]){
        int limit=1000000000;
        double startTime = System.currentTimeMillis();
        

        boolean numbers[] = new boolean[limit+1];
        for(int i=0;i<=limit;i++){
            numbers[i]=false;
        }
        int arr_ind=0;
        int temp=0;
        int thirty_nums=0;
        int arr[]={1,7,11,13,17,19,23,29,31,37,41,43,47,49,53,59};
        int i=0;
        while(i<=limit){
            
            if(arr_ind==16){
                temp++;
                thirty_nums=60*temp;
                arr_ind=0;
            }
            
            numbers[i]=true;
            
            
            i=thirty_nums+arr[arr_ind];
            arr_ind++;
        }
        for(int multiples=7;multiples*multiples<=limit;multiples++){
            if(numbers[multiples]){
                int inc=multiples*2;
                for(int j=multiples*multiples;j<=limit;j+=inc){
                    numbers[j]=false;
                }
            }
        }
        System.out.println();
        int count=3;
        for(int a=5;a<=limit;a++){
            if(numbers[a]){
                
                count++;
                
                
            }
        }
        double endTime = System.currentTimeMillis();
        System.out.println(count);
        System.out.println((endTime-startTime)/1000);
    }
}