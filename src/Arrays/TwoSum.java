package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] findSum(int a[],int target){
        int result[]=new int[2];
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(target-a[i])){
                map.put(a[i],i);
            }else{
                result[1]=i;
                result[0]= map.get(target-a[i]);
                return result;
            }
        }
    return result;
    }
    public static void main(String[] args) {
    TwoSum t=new TwoSum();
    int a[]={1,3,5,6,7};

    int result[]=t.findSum(a,4);
    for(int i:result){
        System.out.println(i);
    }

    }
}
