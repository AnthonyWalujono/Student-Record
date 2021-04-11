/**
  A class that shows the record of the student's grade .
  @author Anthony Walujono
  @version 1.0
*/

public class StudentRecord {

  /**
    * The five assignments for the student's record.
    */
  private int m_quiz1;
  private int m_quiz2;
  private int m_quiz3;
  private int m_midterm;
  private int m_finalExam;
  /**
    * The percentage of the studne's record
    */
  private double m_numericScore;
  /**
    * The letter grade of the studnet's record
    */
  private String m_letterGrade;

  //constructors create an instance of an object

  /**
    * Default constructor initializing integer fields to 0, double fields to 0.0 and String fields to "None".
    */
  public StudentRecord() {
    m_quiz1 = 0;
    m_quiz2 = 0;
    m_quiz3 = 0;
    m_midterm = 0;
    m_finalExam = 0;
    m_numericScore = 0.0;
    m_letterGrade = "None";
  }

  /**
      * Constructor initializing m_quiz1 to m_quiz1,
      * m_quiz2 to quiz2, m_quiz3 to quiz3,
      * m_midterm to midterm, and m_finalExam to finalExam.
      * @param quiz1 quiz portion of grade
      * @param quiz2 quiz portion of grade
      * @param quiz3 quiz portion of grade
      * @param midterm portion of Grade
      * @param finalExam portion of Grade
      */
  public StudentRecord (int quiz1, int quiz2, int quiz3, int midterm, int finalExam) {
    m_quiz1 = quiz1;
    m_quiz2 = quiz2;
    m_quiz3 = quiz3;
    m_midterm = midterm;
    m_finalExam = finalExam;
  }

  //Accessor and Mutators

  /**
      * Sets m_quiz1 to quiz1
      * @param quiz1 portion of grade
 */
  public void setQuiz1(int quiz1) {
    m_quiz1 = quiz1;
  }

  /**
      * returns an integer
      * @return m_quiz1 portion of grade
 */
  public int getQuiz1() {
    return m_quiz1;
  }

  /**
      * Sets m_quiz2 to quiz2
      * @param quiz2 portion of grade
 */
  public void setQuiz2(int quiz2) {
    m_quiz2 = quiz2;
  }

  /**
      * returns an integer
      * @return m_quiz2 portion of grade
 */
  public int getQuiz2() {
    return m_quiz2;
  }

  /**
      * Sets m_quiz3 to quiz3
      * @param quiz3 portion of grade
 */
  public void setQuiz3(int quiz3) {
    m_quiz3 = quiz3;
  }

  /**
      * returns an integer
      * @return m_quiz3 portion of grade
 */
  public int getQuiz3() {
    return m_quiz3;
  }

  /**
      * Sets m_midterm to midterm
      * @param midterm portion of grade
 */
  public void setMidterm(int midterm) {
    m_midterm = midterm;
  }

  /**
      * returns an integer
      * @return m_midterm portion of grade
 */
  public int getMidterm() {
    return m_midterm;
  }

  /**
      * Sets m_finalExam to finalExam
      * @param finalExam portion of grade
 */
  public void setFinalExam(int finalExam) {
    m_finalExam = finalExam;
  }

  /**
      * returns an integer
      * @return m_finalExam portion of grade
 */
  public int getFinalExam() {
    return m_finalExam;
  }

  /**
      * calcualte the total score
      * @return a double
  */
  public double computeNumericScore() {
    m_numericScore = ((m_quiz1 + m_quiz2 + m_quiz3)/30.00) * 0.25 + (m_midterm/100.00) * 0.35 + (m_finalExam/100.00) * 0.4;
    return m_numericScore * 100;
  }

  /**
      * converts the percentage grade into a leeter grade
      * @return m_letterGrade a string
  */
  public String computeLetterGrade() {
    if (computeNumericScore() >= 90.0) {
      m_letterGrade = "A";
    }
    else if (computeNumericScore() >= 80.0 && computeNumericScore() < 90.0) {
      m_letterGrade = "B";
    }
    else if (computeNumericScore() >= 70.0 && computeNumericScore() < 80.0) {
      m_letterGrade = "C";
    }
    else if (computeNumericScore() >= 60.0 && computeNumericScore() < 70.0) {
      m_letterGrade = "D";
    }
    else {
        m_letterGrade = "F";
    }
    return m_letterGrade;
  }

  /**
      * determines if two student records are the same
      * @return boolean
  */
  public boolean equals(StudentRecord s) {
    return (m_quiz1 == s.m_quiz1 && m_quiz2 == s.m_quiz2 && m_quiz3 == s.m_quiz3
            && m_midterm == s.m_midterm && m_finalExam == s.m_finalExam);
  }

  /**
      * @return a string of the studnet's record
  */
  public String toString() {
      return "Quiz 1: " + m_quiz1 + "/10 \n"+
       "Quiz 2: " + m_quiz2 + "/10 \n" +
       "Quiz 3: " + m_quiz3 + "/10 \n" +
       "Midterm: " + m_midterm + "/10 \n" +
       "Final Exam: " + m_finalExam + "/10 \n" +
       "Total Score: " + computeNumericScore() + "% \n" +
       "Letter Grade: " + computeLetterGrade();
  }

  /**
    * Asks for once, creating two StudentRecord objects
    * by calling the overload constructor
    * Comparing two different studnetrecords
    * @param args command-line arguments
    * @see StudentRecord#StudentRecord()
    * @see StudentRecord#equals()
    */
  public static void main(String[] args) {
    StudentRecord s1 = new StudentRecord(9, 7, 10, 85, 93);
    System.out.println(s1);
    System.out.println();
    StudentRecord s2 = new StudentRecord(9, 7, 8, 60, 80);
    System.out.println(s2);
    System.out.println();
    System.out.println(s1.equals(s2));
  }
}
