public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            max = Math.max(arr[i], max);

            arr[i] = max;
        }

        return arr;
    }
}
