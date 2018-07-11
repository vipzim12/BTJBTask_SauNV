package CharSequence;

public class ReverseString implements CharSequence {
	private char ch[];

	public String reverseString(String str) {
		ch = str.toCharArray();
		int charLength = ch.length;
		char charTemp[] = new char[charLength];
		for (int i = 0; i < ch.length; i++) {
			charTemp[charLength - 1] = ch[i];
			charLength--;
		}
		ch = charTemp;
		return new String(ch);
	}

	@Override
	public char charAt(int index) {

		return ch[index];
	}

	@Override
	public int length() {

		return ch.length;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		char c[] = null;
		int j = 0;
		for (int i = start; i < end; i++) {
			c[j] = ch[i];
			j++;
		}
		String str = new String(c);
		return str;
	}

	public String toString() {

		return new String(ch);
	}
}
