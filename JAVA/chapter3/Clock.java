public class Clock{
   private int hour;
   private int minute;
   private int second;

public Clock(int hour, int minute, int second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;


    if (hour > 23 || minute > 60 || second > 60){
    this.hour = 0;
    this.minute = 0;
    this.second = 0;
    System.out.println("Invalid");
  }   
}

if (hour >= 0 && hour <= 23){
    this.hour = hour;
   } else{
   System.out.println("Invalid hour");
   this.hour = 0;
   }

   if (minute >= 0 && minute <= 23){
    this.minute = minute;
   } else {
    System.out.println("Invalid");
    this.minute = 0;
    }

   if (second >= 0 && second <= 23){
    this.second = second;    
   } else {
    System.out.println("Invalid");	
    this.minute = 0;    
    }


   public int getHour(){
    return hour;
   }
   
   public int getMinute(){
   return minute;
   }
   
   public int getSecond(){
   return second;
   }

  public int displayTime(){
  System.out.printf("%02d:%02d:%02d", hour, minute, second);
  }
   
}