package lab_03;

public class Lab_03_04 {
    public static void main(String[] args) {

        int [] arr1 = {1,12,16,28,34};
        int [] arr2 = {1,13,16,27,99};
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        for (int x : arr1) {
            mergeElementToArray(x,arr2,arr2Length);
            arr1Length++;
        }
        
    }

    private static void mergeElementToArray(int x, int[] arr2, int arr2Length) {
        boolean findOutK = false;
        for (int k = 0; k < arr2.length; k++) {
            findOutK = true;
            if (arr2[k] > x){
                for (int m = arr2Length -1 ; m > k; m--) {
                    arr2[arr2Length+1] = arr2[arr2Length];
                }
                arr2[k] = x;
                break;
            }

            if (findOutK == false){
                arr2[arr2Length] = x;
            }
        }


    }
}
