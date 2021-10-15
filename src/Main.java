public class Main {

    public static void main(String[] args) {
	// This app checks if randomly assigned number is even
        int randomNumber = (int)(Math.random() * (100 - 1));

    // if statement checks if the number is even
        if (randomNumber % 2 == 0){
            System.out.println("Number is even. The number is: " + randomNumber);
        }
        else{
            System.out.println("Number is odd. The number is: " + randomNumber);
        }
    }
}
