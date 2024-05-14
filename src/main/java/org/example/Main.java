package org.example;

import java.io.UncheckedIOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.print("Hello and welcome!");
    for (int i = 1; i <= 5; i++) {
      //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons
      // .Debugger.Db_set_breakpoint"/> breakpoint
      // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
      System.out.println("i = " + i);
    }

    // this is an unused variable
    int i = 0;
    // this is another unused variable
    int j = 0;
    int k = 0;
    int l = 0;
    // this is NPE
    String s = null;
    System.out.println(s.length());
  }

  void processFile(String fileName) throws Exception {
    try {
      doProcessFile(fileName);
    } catch(Exception ex) {
      if (ex instanceof UncheckedIOException) {
        // Warning: catch block parameter reassigned
        ex = ((UncheckedIOException) ex).getCause();
      }
      throw ex;
    }
  }

  void doProcessFile(String fileName) throws Exception {
    // process file
  }
}
