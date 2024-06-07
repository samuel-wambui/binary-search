//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arry[]={1,2,3,4,5,6,7,8,9};
        int target=7;
        int result=binarysearch(arry,target);
        if(result !=-1){
            System.out.println("number found at index " +result);
        }
        else System.out.println("number not found");

    }

    private static int binarysearch(int[] arry, int target) {
        int start=0;
        int end= arry.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(arry[mid]==target){
                return mid;
            } else if (arry[mid]<target) {
                start=mid+1;
            } else if (arry[mid]>target) {
                end=mid-1;
            }
            else {
                return 0;
            }
        }
        return -1;
    }
    }
