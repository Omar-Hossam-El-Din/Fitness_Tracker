
package fitness_tracker;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fitness_tracker {

    
    public static void main(String[] args) {
        new Window().setVisible(true);
        System.out.println("1. swimming");
        System.out.println("2. running");
        System.out.println("3. kickboxing");
        System.out.println("4. strength training");
        int total_calories=0;
        double total_heart_rate=80f;
        System.out.println("Enter your chioce or 0 to exit");
        char c;
        Scanner scan = new Scanner ( System.in);
        c=scan.next().charAt(0);
        int swimc=0,boxc=0,runc=0,trainc=0;
        double swimr=0f,boxr=0f,runr=0f,trainr=0f;
       while (c!='0')
       {
        switch(c)
        {
            case '1':
            {
                System.out.println("Enter the time ");
                int time;
                time =scan.nextInt();
                swimming swim=new swimming();
                swim.heart_rate=total_heart_rate;
                System.out.println("The calories burnt is "+(swim.getCalories(time)+total_calories));
                System.out.println("The heart rate  is "+swim.getHeart_rate(time));
                swimr+=(swim.getHeart_rate(time)-total_heart_rate);
                total_calories+=swim.getCalories(time);
                total_heart_rate=swim.getHeart_rate(time);
                swimc+=swim.getCalories(time);
                                break;

            }
            case '2':
            {
                System.out.println("Enter the time ");
                int time;
                time =scan.nextInt();
                running run=new running();
                run.heart_rate=total_heart_rate;
                System.out.println("The calories burnt is "+(run.getCalories(time)+total_calories));
                System.out.println("The heart rate  is "+run.getHeart_rate(time));
                runr+=(run.getHeart_rate(time)-total_heart_rate);
                total_calories+=run.getCalories(time);
                total_heart_rate=run.getHeart_rate(time);
                runc+=run.getCalories(time);
                
                                break;

            }
            case '3':
            {
                System.out.println("Enter the time ");
                int time;
                time =scan.nextInt();
                kickboxing box=new kickboxing();
                box.heart_rate=total_heart_rate;
                System.out.println("The calories burnt is "+(box.getCalories(time)+total_calories));
                System.out.println("The heart rate  is "+box.getHeart_rate(time));
                boxr+=(box.getHeart_rate(time)-total_heart_rate);
                total_calories+=box.getCalories(time);
                total_heart_rate=box.getHeart_rate(time);
                boxc+=box.getCalories(time);
                
                                break;

            }
            case '4':
            {
                System.out.println("Enter the time ");
                int time;
                time =scan.nextInt();
                strength_training train=new strength_training();
                train.heart_rate=total_heart_rate;
                System.out.println("The calories burnt is "+(train.getCalories(time)+total_calories));
                System.out.println("The heart rate  is "+train.getHeart_rate(time));
                trainr+=(train.getHeart_rate(time)-total_heart_rate);
                total_calories+=train.getCalories(time);
                total_heart_rate=train.getHeart_rate(time);
                trainc+=train.getCalories(time);
                
                                break;

            }
            default:
                System.out.println("-----------------unsuitable choice---------------");
                break;
                
        }
        System.out.println("Enter your chioce or 0 to exit");
        c=scan.next().charAt(0);
       }
        System.out.println("Result : ");
        System.out.println("Total calories burnt "+ total_calories);
        System.out.println("Total heart rate "+total_heart_rate);
        
        List<sort> s= new ArrayList<sort>();
        s.add(new sort ("Swimming",swimc,swimr));
        s.add(new sort("Running",runc,runr));
        s.add(new sort ("Kickboxing",boxc,boxr));
        s.add(new sort("Strength training",trainc,trainr));
        Collections.sort(s,Collections.reverseOrder());
        System.out.println(s);
        
       

       new Window().setVisible(true);

    }
    
    
    
    
  static double [] operation (int index,int t,double calories,double heartrate)
    {
        double total_calories=calories;
        double total_heart_rate=80f;
        int swimc=0,boxc=0,runc=0,trainc=0;
        double swimr=0f,boxr=0f,runr=0f,trainr=0f;
        double ac=0;
        double ar=0;
        switch(index)
        {
            case 1:
            {
                int time;
                time = t;
                swimming swim=new swimming();
                swim.heart_rate=heartrate;
                //System.out.println("The calories burnt is "+(swim.getCalories(time)+total_calories));
                ac=(swim.getCalories(time)+total_calories);
                //System.out.println("The heart rate  is "+swim.getHeart_rate(time));
                ar=swim.getHeart_rate(time);
                //swimr+=(swim.getHeart_rate(time)-total_heart_rate);
                total_calories+=swim.getCalories(time);
                total_heart_rate=swim.getHeart_rate(time);
                //swimc+=swim.getCalories(time);
                                break;

            }
            case 2:
            {
                int time=t;
                running run=new running();
                run.heart_rate=heartrate;
                //System.out.println("The calories burnt is "+(run.getCalories(time)+total_calories));
                ac=(run.getCalories(time)+total_calories);
                //System.out.println("The heart rate  is "+run.getHeart_rate(time));
                ar=run.getHeart_rate(time);
                //runr+=(run.getHeart_rate(time)-total_heart_rate);
                total_calories+=run.getCalories(time);
                total_heart_rate=run.getHeart_rate(time);
                //runc+=run.getCalories(time);
                
                                break;

            }
            case 3:
            {
                
                int time=t;
                kickboxing box=new kickboxing();
                box.heart_rate=heartrate;
                //System.out.println("The calories burnt is "+(box.getCalories(time)+total_calories));
                ac=(box.getCalories(time)+total_calories);
                //System.out.println("The heart rate  is "+box.getHeart_rate(time));
                ar=box.getHeart_rate(time);
                //boxr+=(box.getHeart_rate(time)-total_heart_rate);
                total_calories+=box.getCalories(time);
                total_heart_rate=box.getHeart_rate(time);
                //boxc+=box.getCalories(time);
                
                                break;

            }
            case 4:
            {
                int time=t;
                strength_training train=new strength_training();
                train.heart_rate=heartrate;
                //System.out.println("The calories burnt is "+(train.getCalories(time)+total_calories));
                ac=(train.getCalories(time)+total_calories);
                //System.out.println("The heart rate  is "+train.getHeart_rate(time));
                ar=train.getHeart_rate(time);
                //trainr+=(train.getHeart_rate(time)-total_heart_rate);
                total_calories+=train.getCalories(time);
                total_heart_rate=train.getHeart_rate(time);
                //trainc+=train.getCalories(time);
                
                                break;

            }
            default:
            {
                System.out.println("-----------------ERROR---------------");
                break;
            }
            
        }
        
        //System.out.println("Result : ");
        //System.out.println("Total calories burnt "+ total_calories);
        //System.out.println("Total heart rate "+total_heart_rate);
        double [] s={ ac, ar , total_calories ,total_heart_rate };
        return s;
        
    }
    
    
}
    