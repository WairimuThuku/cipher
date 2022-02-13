public class App {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean runningProgram = true;
        while (runningProgram) {
            System.out.println("Hey there, this is The Ceasar Cipher, you can choose to encrypt a word, decrypt a word or exit the program. Enter Encrypt, Decrypt or Exit");
            String directionChoice = input.next();


            if (directionChoice.equals("Encrypt")) {

                System.out.println("Enter a word to be encrypted: ");
                String inputText = input.next();

                System.out.println("Great job, now enter the shift: ");
                Integer inputShift = input.nextInt();

                Cipher inputCaesarEncrypt = new Cipher(inputText, inputShift);
                String cipherText = inputCaesarEncrypt.encrypt(inputText, inputShift);

                System.out.println("Your encrypted word is " + cipherText);


