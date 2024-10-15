
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//public static void main(String[] args) {
public class Minv {
 
public static void main(String[] args) {
 
//using the first test from codestepbystep
 
List<Integer> list = new ArrayList<>();
 
list.add(3);
 
list.add(7);
 
list.add(3);
 
list.add(-1);
 
list.add(2);
 
list.add(3);
 
list.add(7);
 
list.add(2);
 
list.add(15);
 
list.add(15);
 
int numUnique = numUniqueValues(list);
 
System.out.println("Number of unique values: " + numUnique);
 
}
 
public static int numUniqueValues(List<Integer> list) {
 
HashSet<Integer> set = new HashSet<Integer>();
 
for (int i : list) {
 
set.add(i);
 
}
 
return set.size();
 
}
 
