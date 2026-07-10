public class twoSum {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,10,12};
        int target = 15;
        int L = 0;
        int R = arr.length-1;
        int count =0;
        while(L<=R){
        int sum = arr[L] + arr[R];
            if(sum==target){
                System.out.println("Present : "+arr[L]+" + "+arr[R]);
                // return;
                count++;
                L++;         
                R--;
            }else if(sum>target){
                R--;
            }else{
                L++;
            }
        }
        if (count==0) {
            
            System.out.println("Not Present");
        }
        System.out.println("No.of pairs : "+count);
    }
}
