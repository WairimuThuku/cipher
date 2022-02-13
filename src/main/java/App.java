public class App {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean runningProgram = true;
        while (runningProgram) {
            System.out.println("Hey there, this is The Ceasar Cipher, you can choose to encrypt a word, decrypt a word or exit the program. Enter Encrypt, Decrypt or Exit");
            String directionChoice = input.next();

