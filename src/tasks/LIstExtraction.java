package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class LIstExtraction {

  public static void main(String[] args) {
    List<Long> sourceList = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 6L, 5L, 4L, 5L));
    List<Long> substractList = new ArrayList<>(Arrays.asList(2L, 5L, 8L));
    subtractList(sourceList, substractList);
    System.out.println(sourceList);
  }

  static void subtractList(List<Long> sourceList, List<Long> substractList){
    final Iterator<Long> subIter = substractList.iterator();
    while (subIter.hasNext()){
      final Iterator<Long> sourceIter = sourceList.iterator();
      final Long nextSubstract = subIter.next();
      while(sourceIter.hasNext()){
        final Long nextSource = sourceIter.next();
        if(nextSource.equals(nextSubstract)){
          sourceIter.remove();
        }
      }
    }
  }
}
