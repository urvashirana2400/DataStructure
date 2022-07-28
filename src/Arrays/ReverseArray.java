package Arrays;

public class ReverseArray {
    public void reverseElement(int a[]){
        int start=0;
        int end=a.length-1;
        while (start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public boolean isPalindrome(String str){
        char c[]=str.toCharArray();
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(c[start] !=c[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public int findSecondMax(int a[]){
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                secondmax=max;
                max=a[i];

            }else if(a[i]>secondmax && a[i]!=max){
                secondmax=a[i];
            }
        }
        return secondmax;

    }

    public void moveZeroToEnd(int a[]){
        int j=0;
        for (int i=0;i<a.length;i++){
            if(a[i]!=0 && a[j]==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            if(a[j]!=0){
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,0,6,0,5,9,0,7};
        ReverseArray ra=new ReverseArray();
        ra.print(a);
        ra.reverseElement(a);
        System.out.println("reverse:");
        ra.print(a);
        System.out.println("Second Max element:"+ra.findSecondMax(a));
        System.out.println("Move zero to tail end");
        ra.moveZeroToEnd(a);
        ra.print(a);
        String s="madam";
        String y="hello";
        System.out.println("first check:"+ra.isPalindrome(s));
        System.out.println("second check:"+ra.isPalindrome(y));


    }
}
