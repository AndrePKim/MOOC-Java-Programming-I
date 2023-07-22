
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> average;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.average = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.average.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        double sum = 0;
        for (int i=0; i<this.grades.size(); i++) {
            sum += this.grades.get(i);
        }
        return sum/this.grades.size();
    }
    
    public double averageOfPoints() {
        if (this.average.isEmpty()) {
            return -1;
        }
        double sum = 0;
        for (int i=0; i<this.average.size(); i++) {
            sum += this.average.get(i);
        }
        return sum/this.average.size();
    }
}
