package idonotknowhowicannamedthispackege;

public class CreatSortedArray {
    public static int[] creatSortedArray(int[] first, int[] second) {
        if (first == null || second == null) {
            return null;
        }
        int[] result = new int[first.length + second.length];
        int iFirst = 0;
        int iSecond = 0;
        for (int i = 0; i < result.length; i++) {
            if (i - iFirst < first.length && i - iSecond < second.length) {
                if (first[i - iFirst] < second[i - iSecond]) {
                    result[i] = first[i - iFirst];
                    iSecond++;
                } else {
                    result[i] = second[i - iSecond];
                    iFirst++;
                }
            } else {
                if (i - iFirst < first.length) {
                    result[i] = first[i - iFirst];
                } else {
                    result[i] = second[i - iSecond];
                }
            }
        }
        return result;
    }
}

