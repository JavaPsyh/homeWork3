package idonotknowhowicannamethispackageoverdotes;

public class AsciiCharSequence implements CharSequence {
    private byte[] arrayOfBytes;

    public AsciiCharSequence(byte[] arrayOfBytes) {
        this.arrayOfBytes = arrayOfBytes;
    }

    @Override
    public int length() {
        return arrayOfBytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) arrayOfBytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        if (end < start) {
            return "Invalid parameters";
        }

        byte[] result = new byte[end - start];

        for (int i = start; i < end; i++) {
            result[i - start] = arrayOfBytes[i];
        }
        return new AsciiCharSequence(result);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(arrayOfBytes.length);
        for (int i = 0; i < arrayOfBytes.length; i++) {
            result.append((char) arrayOfBytes[i]);
        }
        return result.toString();
    }
}
