public class NextGreaterNumberClass {

  public static void main(String args[]) {
    int arrayList[] = {14, 10, 32, 1};
    int arrayLength = arrayList.length;
    calculateAndPrintNextGreaterNumber(arrayList, arrayLength);
  }

  static void calculateAndPrintNextGreaterNumber(int arrayList[], int arrayLength) {
    int next, i, j;
    for (i = 0; i < arrayLength; i++) {
      next = -1;
      for (j = i + 1; j < arrayLength; j++) {
        if (arrayList[i] < arrayList[j]) {
          next = arrayList[j];
          break;
        }
      }
      System.out.println(arrayList[i] + " --> " + next);
    }
  }
}
