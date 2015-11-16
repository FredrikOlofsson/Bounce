package bounce;


public class Bounce {
    public static void main(String[] args) {
        bounce(10);

    } 
    /**
     * Takes an int and does a recursive loop until it reaches 0, then it loops back up again.
     * @param num int number to start the loop ex 5; prints: 5,4,3,2,1,1,2,3,4,5
     * @return returns the value you put in
     */
    private static int bounce(int num){
        if (num <= 0){
            System.out.print("\t");
            return num;
        }
        System.out.print(num+" ");
        bounce(num-1);
        System.out.print(num+" ");
            return num;
    }
}
