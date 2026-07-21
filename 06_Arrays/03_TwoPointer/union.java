public class union{
    public static void printUnion(int arr1[],int m,int arr2[],int n){
        int i=0,j=0,k=0;
        int result[] = new int[m+n];
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                if(k==0 || result[k-1]!=arr1[i]){  
                    result[k++] = arr1[i];
                }
                i++;
            }else if(arr1[i]>arr2[j]){
                if(k==0 || result[k-1]!=arr1[j]){  
                result[k++] = arr2[j];
                }
                j++;
            }else{
                if(k==0 || result[k-1]!=arr1[i]){  
                result[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }
        while(i<m){
            if(k==0 || result[k-1]!=arr1[i]){ 
            result[k++] = arr1[i];
            }
            i++;
        }
        while(j<n){
            if(k==0 || result[k-1]!=arr1[j]){  
            result[k++] = arr2[j];
            }
            j++;
        }
        for (int l = 0; l < k; l++) {
            System.out.print(result[l]+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int m=arr1.length,n=arr2.length;
        printUnion(arr1,m,arr2,n);
    }
}