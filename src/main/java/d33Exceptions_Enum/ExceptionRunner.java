package d33Exceptions_Enum;

public class ExceptionRunner {

    public static void main(String[] args) {
        grade(90);


      //  InvalidStudentGradeException f=new InvalidStudentGradeException();
    }
    public static void  grade(int grade){

        if (grade<0||grade>100){
            try{
                throw new InvalidStudentGradeException("Grade can not be less than zero or higher than 100");
            } catch(InvalidStudentGradeException ieo) {
                ieo.printStackTrace();
            }
        }else {
            System.out.println(grade);
        }
    }
}
