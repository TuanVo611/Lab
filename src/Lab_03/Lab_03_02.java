package Lab_03;

public class Lab_03_02 {
    public static void main(String[] args) {
        int [] intArr = {1,2,3,4,5};
        int minValue = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < minValue){
                intArr[i] = minValue;
            }
        }
        System.out.println(minValue);

        findMaxValue();


        System.out.println("Max Value: " + findMaxValue());

    }

    private static int findMaxValue() {
        int [] intArr = {1,2,3,4,5};
        int maxValue = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > maxValue){
                maxValue = intArr[i];
            }
        }
        return maxValue;
    }
}
