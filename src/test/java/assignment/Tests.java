package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void code(){
       App.main(null);
       assertEquals(2, App.diff21(19), "INCORRECT");
       assertEquals(0, App.diff21(21), "INCORRECT");
       assertEquals(22, App.diff21(32), "INCORRECT");
   }

   @Test
    public void late() {
        App.main(null);
        assertTrue(DueDate.onTime(2021, 1, 7), "Submitted Late");
    }

}
