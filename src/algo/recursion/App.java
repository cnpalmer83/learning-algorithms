package algo.recursion;

/*
    This program demonstrates recursive behavior on the stack.  Try to guess
    which value of n prints first, then read the explanation following the code.
 */
public class App {

    public static void main(String[] args) {
        reduceByOne(5);                             // The first call
    }

    public static void reduceByOne(int n) {
        if (n >= 0)                                    // The base case
            reduceByOne(n - 1);

        System.out.println("Completed call: " + n);    // The final instruction
    }
}



/*
    The first call is the integer value 5.  Before reduceByOne(5) can be completed,
    reduceByOne(4) is called.  reduceByOne(5) remains on the stack with the
    reduceByOne(4) call on top of it.  reduceByOne(3) is then placed on (4).
    reduceByOne(2) is placed on (3).  reduceByOne(1) is placed on (2).
    reduceByOne(0) is placed on (1).  ReducedByOne(0) results in the recursive
    call reduceByOne(-1).  -1 is outside of the base case argument, so the 'if'
    statement is skipped and the print instruction is carried out.  This completes
    the reduceByOne(-1) call which is then popped off the stack.  reduceByOne(0)
    can then reach its print statement and complete its final instruction which
    results in it being popped from the stack.  This continues until the last
    remaining call (which is reduceByOne(5)) is popped from the stack.
 */
