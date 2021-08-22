
package fitness_tracker;


public class sort implements Comparable<sort> {
    private String activityname;
    private int totalcalory;
    private double total_heart_rate;

    public sort(String activityname, int totalcalory, double total_heart_rate) {
        this.activityname = activityname;
        this.totalcalory = totalcalory;
        this.total_heart_rate = total_heart_rate;
    }

    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }

    public int getTotalcalory() {
        return totalcalory;
    }

    public void setTotalcalory(int totalcalory) {
        this.totalcalory = totalcalory;
    }

    public double getTotal_heart_rate() {
        return total_heart_rate;
    }

    public void setTotal_heart_rate(double total_heart_rate) {
        this.total_heart_rate = total_heart_rate;
    }

    @Override
    public int compareTo(sort o) 
    {
        int compare = Integer.compare(totalcalory,o.totalcalory);
        if (compare==0)
        {
            compare = Double.compare(total_heart_rate, o.total_heart_rate);
            
        }
        return compare;
            
    }
    public String toString()
    {
        return "\nActivity : " + activityname + "\nTotal calories "+totalcalory+"\nHeart rate "+total_heart_rate+"\n";
        
        
        
    }
    
        
}
