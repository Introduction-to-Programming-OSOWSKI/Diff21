package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void test(){
       App.main(null);
       assertEquals(2, App.diff21(19), "INCORRECT");
       assertEquals(0, App.diff21(21), "INCORRECT");
       assertEquals(20, App.diff21(31), "INCORRECT");
   }

}
