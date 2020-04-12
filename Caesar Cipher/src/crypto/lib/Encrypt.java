package crypto.lib;

public class Encrypt {

	private int key;
	private String plaintext;
	
	
	private char shiftter(char chr, int step) {
		int temp = (int)chr + step;
		if (temp>126) {
			temp = temp - 94;
		}
		return (char) temp;
	}

	public StringBuilder genCipher(String plaintext, int key) {
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i < plaintext.length(); i++) {
			char chr = shiftter(plaintext.charAt(i), key);
			temp.append(chr);
		}
		return temp;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getPlaintext() {
		return plaintext;
	}

	public void setPlaintext(String plaintext) {
		this.plaintext = plaintext;
	}

}
