public class Cipher {
    private String plainWord;
    private int shift;
    public Cipher(String plainWord, int shift){
        this.plainWord = plainWord;
        this.shift = shift;
    }
    public String getPlainWord(){
        return plainWord;
    }

    public int getShift(){
        return shift;
    }
    public static String encrypt(String plainWord, int shift){
        if(shift > 26){
            shift = shift % 26;
        } else if (shift < 0){
            shift = (shift % 26) + 26;
        }
}
