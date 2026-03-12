public class searchString {

    public static int fruits(String arr[],String target){
        for(int i=0;i<arr.length;i++){
            if (target.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String arr [] = {"apple","mango","orange"};
        String target = "mango";
        int fruit = fruits(arr,target);
        System.out.println("Fruit found at index : "+fruit);

    }
}
