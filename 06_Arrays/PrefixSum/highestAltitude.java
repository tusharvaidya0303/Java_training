package PrefixSum;

public class highestAltitude {
    public static void main(String[] args) {
        int gain[] = {-5,1,5,0,-7};
        int altitude = 0;
        int max = 0;

        for(int i = 0; i < gain.length; i++){
            altitude += gain[i];
            
            if(altitude > max){
                max = altitude;
            }
        }
        System.out.println("Highest Altitude: " + max);
    }
}
