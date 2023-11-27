public class ClockTest{
public static void main(String[] args){

Clock clock = new Clock(10, 02, 30);

System.out.printf("Initial time is %02d:%02d:%02d", clock.getHour(), clock.getMinute(), clock.getSecond());

clock.setHour(11);
clock.setMinute(16);
clock.setSecond(33);
clock.displayTime();

}
}