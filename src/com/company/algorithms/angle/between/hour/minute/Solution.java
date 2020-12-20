package algorithms.angle.between.hour.minute;

public class Solution {

    public static void main(String[] args) {
        System.out.println(calculateAngle(1, 30));
    }

    private static double calculateAngle(int hour, int minute) {
        double hourDegree = 360d / 12d;
        double minuteDegree = 360d / 60d;
        double hourMinuteDegree = 360d / (12d * 60d);

        double angle = (minute * minuteDegree) - (hour * hourDegree + (minute * hourMinuteDegree));

        return angle;
    }
}
