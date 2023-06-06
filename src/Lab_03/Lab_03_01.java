package Lab_03;

public class Lab_03_01 {
    public static void main(String[] args) {
        int [] intArr = {1,2,3,4,5};
        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0){
                evenNumber++;
            }else {
                oddNumber++;
            }
        }

        System.out.println("Number of even: " + evenNumber);
        System.out.println("Number of odd: " + oddNumber);
    }
}
