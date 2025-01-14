package blind75;

//Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand

//Input: hour = 12, minutes = 30
//Output: 165

public class AngleBetweenHandsOfClock {
    public static void main(String[] args) {
        
        int hourHand = 12;
        int minuteHand = 30;

        //Nornalize the hours
        hourHand = hourHand % 12;

        
        // hour hand moves 30 deg in 60 mins i.e. 0.5 deg in 1 min
        // hour hand moves 30 deg per hrs and 0.5 deg per min
        double hourAngle = (hourHand*30)+(minuteHand*0.5);

        // minute hand moves 30 deg in 5 mins i.e. 6 deg in 1 min
        double minuteAngle = minuteHand*6;

        //absolute angle 
        double angleDifference = Math.abs(hourAngle - minuteAngle);

        System.out.print( Math.min(angleDifference, 360 - angleDifference));

        
    }
}
