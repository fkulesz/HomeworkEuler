
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Objects;

public class EulerTest {
    private static final int LIMIT = 4000000;
    private Euler euler = new Euler();

    @Test
    @DisplayName("CheckLastNumber")
    public void checkIfLastNumberIsSmallerThanGivenLimit(){
        //given
        List<Integer> fibonaciiList = null;

        //when
        fibonaciiList = Euler.generateFibonacciNumbers();
        //then
        int lastValueFromTheList =  fibonaciiList.get(fibonaciiList.size()-1);
        Assertions.assertTrue(lastValueFromTheList < LIMIT);
    }

    @Test
    @DisplayName("checkIfFibonaciiNumbersAreValid")
    public void checkIfSeventhAndEighthValuesAreCorrect(){
        //given
        List<Integer> fibonaciiList = null;

        //when
        fibonaciiList = Euler.generateFibonacciNumbers();


        //then
        int seventhValue = fibonaciiList.get(6);
        int eighthValue = fibonaciiList.get(7);
        int ninthValue = fibonaciiList.get(8);
        int result = seventhValue + eighthValue;


        //Assertions.assertTrue(Objects.equals(seventhValue + eighthValue, ninthValue));
        Assertions.assertEquals(ninthValue, result);
    }
    @Test
    public void checkIfResultIsEven(){
        //given
        int result = 0;

        //when
        result = Euler.sumEvenNumbersFromFibonacii();

        //then
        Assertions.assertTrue(result % 2 == 0);
    }



}
