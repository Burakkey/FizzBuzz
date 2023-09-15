/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {
    // Classes starts with Capital Letter.
    public static void main(String[] args) {
        int i = 1; // to define a new variable we need to add its type
        while (i < 100){ // all conditions are in paranthesis
            i = doFizzBuzz(i); // all statements end with either ';' or '{}'
        }
    }

    private static int doFizzBuzz(int i) {
        if  ((i % 3 == 0) && (i % 5 == 0)){ // and sign is different than Python
            System.out.println("Fizz Buzz");
        }
        else if (i % 5 == 0) {
            System.out.println("Fizz");
        }
        else if (i % 3 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(i);
        }
        i++;
        return i;
    }
}