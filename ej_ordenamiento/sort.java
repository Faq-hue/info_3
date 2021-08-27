public class sort {

  public static <AnyType extends Comparable<AnyType>> void insertion(AnyType[] item) {

    for (int p = 1; p < item.length; p++) {
      AnyType tmp = item[p];
      int j = p;
      for (; j > 0 && tmp.compareTo(item[j - 1]) < 0 ; j--)
        item[j] = item[j - 1];
      item[j] = tmp;
    }

  }


  public static <AnyType extends Comparable<AnyType>> void shell(AnyType[] arr) {

    for (int gap = arr.length / 2; gap > 0; gap /= 2) {
      for (int i = gap; i < arr.length; i++) {
        for (int j = i - gap; j >= 0 && arr[j].compareTo(arr[j + gap]) < 0 ; j -= gap) {
          AnyType tmp = arr[j];
          arr[j] = arr[j + gap];
          arr[j + gap] = tmp;
        }
      }
    }


  }

  public static <AnyType extends Comparable<AnyType>> void quicksort(AnyType[] item, int left, int right) {
    int i, j;
    AnyType temp;
    i = left;
    j = right;
    do {
      while (item[i].compareTo(item[j]) < 0 && j > i)
        j--;
      if (i < j) {
        temp = item[i];
        item[i] = item[j];
        item[j] = temp;
        i++;
      }
      while (item[i].compareTo(item[j]) > 0 && i < j)
        i++;
      if (i < j) {
        temp = item[i];
        item[i] = item[j];
        item[j] = temp;
        j--;
      }
    } while (i < j);
    if (left < j)
      quicksort(item, left, j - 1);
    if (i < right)
      quicksort(item, i + 1, right);

  }

}
