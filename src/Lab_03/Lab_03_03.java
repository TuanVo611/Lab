package Lab_03;

public class Lab_03_03 {
    public static void main(String[] args) {
        int [] intArr = {12,34,1,16,28};

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i+1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]){
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(" " + intArr[i]);
        }
    }
}
