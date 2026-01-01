public class DigitalWatchSimulation {
/*          16. Digital Watch Simulation ⏱️
            Simulate a 24-hour watch:
            ● Print hours and minutes in a nested for-loop.
            ● Use a break to stop at 13:00 manually (simulate power cut).
            Core Java Scenario Based Problem Statements */
    public static void main(String[] args) {

        int breakHour = 12;
        int breakMin = 59;
        boolean stop =true;
        int i=0;
        while(stop){
            for(int j = 0 ; j < 60 ; j++){
                if(i==breakHour && j==breakMin){
                    System.out.println("Time = "+13+ ":00");
                    System.out.println("------Watch stop.-----");
                    stop = false;
                }
                else{
                    System.out.println("Time = "+ i +":"+j);
                }

            }
            i++;
        }
    }
}