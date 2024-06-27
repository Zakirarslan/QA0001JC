package d39Lambda;

public class Course {

    private String season;
    private String coursName;
    private int averageCourse;
    private int numberOfStudentson;

    public Course (String season,String coursName,Integer averageCourse, Integer numberOfStudents){
        this.season=season;
        this.coursName=coursName;
        this.averageCourse=averageCourse;
        this.numberOfStudentson= numberOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCourseName() {
        return coursName;
    }

    public void setCoursName(String coursName) {
        this.coursName = coursName;
    }

    public int getAverageScore() {
        return averageCourse;
    }

    public void setAverageCourse(int averageCourse) {
        this.averageCourse = averageCourse;
    }

    public int getNumberOfStudents() {
        return numberOfStudentson;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudentson = numberOfStudents;
    }


    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", coursName='" + coursName + '\'' +
                ", averageCourse='" + averageCourse + '\'' +
                ", numberOfStudentson='" + numberOfStudentson + '\'' +
                '}';
    }
}
