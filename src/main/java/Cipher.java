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
}
