package console;

public class Main {

    public static void main(String[] args) {
	    LambdaAppOne lOne = new LambdaAppOne();
	    lOne.start();

        LambdaAppTwo lTwo = new LambdaAppTwo();
        lTwo.start();

        LambdaAppThree lThree = new LambdaAppThree();
        lThree.start();

        LambdaAppFour lFour = new LambdaAppFour();
        lFour.start();

        LambdaAppFive lFive = new LambdaAppFive();
        lFive.start();
    }
}
