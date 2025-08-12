package udemy.javacourse.com.aula703.entities;

public class Student {
  public String name;

  public double firstGrade;
  public double secondGrade;
  public double thirdGrade;

  public double media = 60.00;

  public double finalGrade() {
    return firstGrade + secondGrade + thirdGrade;
  }

  public void finalStatement() {
    if (finalGrade() > media) {
      System.out.println("PASS");
    } else {
      System.out.println("FAILED");
      System.out.print("MISSING " + (media - finalGrade()) + " POINTS");
    }
  }

}