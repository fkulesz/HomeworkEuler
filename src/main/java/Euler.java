import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Euler {
    private static final int LIMIT = 4000000;

    public static List generateFibonacciNumbers(){
        List<Integer> fibonaciiList = new ArrayList();
        int result = 0;
        int iteratorPrev = 1;
        int iteratorPrev2 = 0;
        while(iteratorPrev2 <= LIMIT){
            fibonaciiList.add(iteratorPrev2);
            result = iteratorPrev + iteratorPrev2;
            iteratorPrev = iteratorPrev2;
            iteratorPrev2 = result;
           // System.out.println("result" + result + " iterator " + iteratorPrev2);
        }
        System.out.println(fibonaciiList.toString());

        return fibonaciiList;
    }

    public static int sumEvenNumbersFromFibonacii(){
        int resultSum = 0;
        List<Integer> fibonaciiList = generateFibonacciNumbers();

        resultSum = fibonaciiList.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer onlyEven) {
                        return onlyEven % 2 == 0;
                    }
                })
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(resultSum + " to odpowiedz");

//        int resultSum2 = 0;
//        for (int i = 0; i <fibonaciiList.size() ; i++) {
//            if(fibonaciiList.get(i) % 2 == 0){
//                resultSum2 += fibonaciiList.get(i);
//            }
//
//        }
//        System.out.println(resultSum2);
        return resultSum;
    }

}
