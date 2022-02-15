package ud05.actividades;

public class Time {
    private int second;
    private int minute;
    private int hour;

    public Time() {
        this.second=0;
        this.minute=0;
        this.hour=0;
    }

    public Time(int second, int minute, int hour) {
        setTime(second, minute, hour);
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setTime(int second, int minute, int hour){
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }
    public Time nextSecond(){
        second++;
        if(minute==60) {
                minute++;
                second=0;
                if(minute ==60){
                    hour++;
                    hour=0;
                    if(hour==24)
                        hour=0;
                }
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }


    public static void main(String[] args){

      Time t1 =new Time();
      System.out.println(t1);
      t1.setTime(12,59,2);
      System.out.println(t1);

    /*  ud05.actividades.Time t2 =new ud05.actividades.Time();
      t2.setTime();
      System.out.println(t2);
    */
    }
}
