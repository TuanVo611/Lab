package lab_06;

public class Lab_06_01 {
    public static void main(String[] args) {
        String inputString = "2hrs and 5 minutes";
        String[] timeSplit = inputString.split(" and ");
//        System.out.println(Arrays.toString(timeSplit));
        String hrs = timeSplit[0].replace("hrs", "").replaceAll(" ","");
        String minutes = timeSplit[1].replace("minutes","").replaceAll(" ","");
        System.out.println(hrs);
        System.out.println(minutes);
        int valueHrs = Integer.parseInt(hrs);
        int valueMinutes = Integer.parseInt(minutes);
        int totalMinutes = (valueHrs*60) + valueMinutes;
        System.out.println("Total minutes of input time: ");
        System.out.print(totalMinutes);
    }
}
