
package fitness_tracker;


public class swimming {
    private int calories=0;
    public double heart_rate=80f;

    public int getCalories(int time) {
        calories=4*time;
        return calories;
    }

    public double getHeart_rate(int time) {
        double newheart_rate;
        newheart_rate = heart_rate + (heart_rate * time  * 0.002);
        return newheart_rate;
    }

    
}
