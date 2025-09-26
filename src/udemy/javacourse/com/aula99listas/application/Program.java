package udemy.javacourse.com.aula99listas.application;

import java.util.ArrayList;
import java.util.List;

public class Program {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("Carlos");
    list.add("João");
    list.add("David");

    for (String var : list) {
      System.out.println(var);
    }

  }
}
