public class twoSum {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,10,12};
        int target = 15;
        int L = 0;
        int R = arr.length-1;
        while(L<=R){
        int x = arr[L] + arr[R];
            if(x==target){
                System.out.println("Present");
                return;
            }else if(x>target){
                R--;
            }else{
                L++;
            }
        }
        System.out.println("Not Present");

    }
}
