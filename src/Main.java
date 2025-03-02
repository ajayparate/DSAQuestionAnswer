import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //For Duplicate Number Find
/*    public static <Integer> Set<Integer> findDuplicateInStream (Stream<Integer> stream){
        Set<Integer> list = new HashSet<>();
        return stream.filter(n->!list.add(n)).collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,2,8,3,4,3,8,9,10,11,15,8,9,10);
        System.out.println("Duplicates numbers are: "+ findDuplicateInStream(stream));

    }

 */
    //Question on climbing stairs
    public static int clibingStairs (int n){
        if(n==1)
            return 1;
        if (n==2)
            return 2;

        int prev1 = 1; //for the first stair
        int prev2 = 2; //for the second stair
        int current = 0;

        for(int i = 3; i<=n; i++){
            current = prev1+prev2;
            prev1 = prev2;
            prev2 = current;

        }
        return current;

    }
    public static void main(String[] args){
        int n = 5;
        System.out.println("the number of stairs = "+clibingStairs(n));
    }

}