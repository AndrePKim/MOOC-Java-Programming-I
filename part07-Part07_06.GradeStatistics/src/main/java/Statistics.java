import java.util.ArrayList;

public class Statistics {
    private ArrayList<Integer> stat;
    
    public Statistics() {
        this.stat = new ArrayList<>();
    }
    
    public void add(int point) {
        if (point>-1 && point<101) {
            this.stat.add(point);
        }
    }
    
    public double average() {
        int sum = 0;
        for (int i=0; i<this.stat.size(); i++) {
            sum += this.stat.get(i);
        }
        return (double)sum/this.stat.size();
    }
    
    public String averagepass() {
        int sum = 0;
        int count = 0;
        for (int i=0; i<this.stat.size(); i++) {
            if (this.stat.get(i)>= 50){
                sum += this.stat.get(i);
                count++;
            }
        }
        if (count==0) {
            return "-";
        }
        return String.valueOf((double)sum/count);
    }
    
    public double passpercent() {
        int count = 0;
        for (int i=0; i<this.stat.size(); i++) {
            if (this.stat.get(i)>= 50){
                count++;
            }
        }
        return 100.0*count/this.stat.size();
    }
    
    public void gradedist() {
        ArrayList<Integer> stars = new ArrayList<>();
        for (int i=0; i<6; i++) {
            stars.add(0);
        }
        for (int i=0; i<this.stat.size(); i++) {
            if (this.stat.get(i)<50){
                stars.set(0, stars.get(0)+1);
            } else if (this.stat.get(i)<60) {
                stars.set(1, stars.get(1)+1);
            } else if (this.stat.get(i)<70) {
                stars.set(2, stars.get(2)+1);
            } else if (this.stat.get(i)<80) {
                stars.set(3, stars.get(3)+1);
            } else if (this.stat.get(i)<90) {
                stars.set(4, stars.get(4)+1);
            } else if (this.stat.get(i)>=90){
                stars.set(5, stars.get(5)+1);
            }
        }
        for (int i=0; i<stars.size(); i++) {
            System.out.print((5-i) + ": ");
            for (int j=0; j<stars.get(5-i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
