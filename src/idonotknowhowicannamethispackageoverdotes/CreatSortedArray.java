package idonotknowhowicannamethispackageoverdotes;

public class CreatSortedArray {
    public static int[] creatSortedArray(int[] first, int[] second) {
        if (first == null || second == null) {
            return null;
        }
        int[] result = new int[first.length + second.length];
        int iFirst = 0;
        int iSecond = 0;
        for (int x = 0; x < result.length; x++) {
            if (x - iFirst < first.length && x - iSecond < second.length) {
                if (first[x - iFirst] < second[x - iSecond]) {
                    result[x] = first[x - iFirst];
                    iSecond++;
                } else {
                    result[x] = second[x - iSecond];
                    iFirst++;
                }
            } else {
                if (x - iFirst < first.length) {
                    result[x] = first[x - iFirst];
                } else {
                    result[x] = second[x - iSecond];
                }
            }
        }
        return result;
    }
}

