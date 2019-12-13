/**
 * Objects of the Time class hold a time value for
 * a European-style 24 hour clock.
 * The value consists of hours, minutes and seconds.
 * The range of the value is 00:00:00 (midnight)
 * to 23:59:59 (one * second before midnight).
 */
public class Time
{
   // The values of the three parts of the time
   private int hours;
   private int minutes;
   private int seconds;

   /**
    * Creates a new Time object set to 00:00:00.
    * Do not change this constructor.
    */
   public Time()
   {
      this.hours = 0;
      this.minutes = 0;
      this.seconds = 0;
   }

   /**
    * Constructor for objects of class Time.
    * Creates a new Time object set to h:m:s.
    * Assumes, without checking, that the parameter values are
    * within bounds.
    * For this task, you don't need to worry about invalid parameter values.
    * Do not change this constructor.
    */
   public Time(int h, int m, int s)
   {
      this.hours = h;
      this.minutes = m;
      this.seconds = s;
   }

   /**
    * Add an offset to this Time.
    * Rolls over the hours, minutes and seconds fields when needed.
    */
    
     public int getSeconds(){
        return seconds;}
    public void setSeconds(int s){
        this.seconds = s;}
            
    public int getminutes(){
        return minutes;}
    public void setminutes(int m){
        this.minutes = m;}
            
    public int gethours(){
        return hours;}
    public void sethours(int h){
        this.hours = h;}
    
   public int upMinValue = 0;
   public int upHourValue = 0;
   public void add(Time offset)
   { int totalSeconds =  time1.seconds + time2.seconds;
       while (totalSeconds >= 60){
           (totalSeconds - 60);
            upMinValue+1;
            time1.setSeconds(totalSeconds);}
    int toatlMinutes = time1.minutes + time2.minutes + upValue;
        while (totalMinutes >= 60){
            (totalMinutes - 60);
            upHourValue+1;
            Time1.setMinutes(totalMinutes);}
    int totalHours = time1.hour + time2.hours + upHourValue;
     if(totalHours >= 24){
         totalHours - 24;
         time1.setHours(totalHours);}
   }
   public String toString()
   {
      return pad(hours) + ":" + pad(minutes) + ":" + pad(seconds);
   }

   /**
    * Returns a string representing the argument value, adding a leading
    * "0" if needed to make it at least two digits long.
    * Do not change this.
    */
   private String pad(int value)
   {
      String sign = "";
      if (value < 0)
      {
         sign = "-";
         value = -1 * value;
       }
       if (value < 10) {
          return sign + "0" + value;
       } else {
          return sign + value;
       }
    }

    public static void main(String[] args)
    {
       Time time1 = new Time(1,1,1);
       Time time2 = new Time(2,2,2);
       time1.add(time2);
       System.out.println("The result of (1,1,1).add(2,2,2) is " +
                           time1 + " and should be (03:03:03)");

       time1 = new Time(0,0,59);
       time2 = new Time(0,0,1);
       time1.add(time2);
       System.out.println("The result of (0,0,59).add(0,0,1) is " +
                           time1 + " and should be (00:01:00)");

       time1 = new Time(0,59,0);
       time2 = new Time(0,0,1);
       time1.add(time2);
       System.out.println("The result of (0,59,0).add(0,0,1) is " +
                           time1 + " and should be (00:59:01)");

       time1 = new Time(0,59,59);
       time2 = new Time(0,0,1);
       time1.add(time2);
       System.out.println("The result of (0,59,59).add(0,0,1) is " +
                           time1 + " and should be (01:00:00)");

       time1 = new Time(23,0,0);
       time2 = new Time(1,0,0);
       time1.add(time2);
       System.out.println("The result of (23,0,0).add(1,0,0) is " +
                           time1 + " and should be (00:00:00)");

       time1 = new Time(23,59,59);
       time2 = new Time(23,59,59);
       time1.add(time2);
       System.out.println("The result of (23,59,59).add(23,59,59) is " +
                           time1 + " and should be (23:59:58)");



    }
 }
