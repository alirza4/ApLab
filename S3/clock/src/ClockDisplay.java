
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before
 * midnight).
 *
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class ClockDisplay
{
    private NumberDisplay secconds;
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        secconds = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the
     * parameters.
     */
    public ClockDisplay(int hour, int minute,int seccond)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        secconds = new NumberDisplay(60);
        setTime(hour, minute,seccond);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        secconds.increment();
        if(secconds.getValue()==0) {// it just rolled over!
            minutes.increment();
            if (minutes.getValue()==0 )
            {hours.increment();}

        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute,int seccond)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        secconds.setValue(seccond);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }

    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" +
                minutes.getDisplayValue() + ":" +
                secconds.getDisplayValue();
    }

    public static void main(String[] args){

        ClockDisplay Clock= new ClockDisplay(24,0,0);
        for (int j=0;j<2000;j++){
            Clock.timeTick();
            System.out.println(Clock.displayString);
        }





    }








}