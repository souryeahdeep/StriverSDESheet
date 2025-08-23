package StriverSDESheet;

import java.util.*;

public class PascalTriangle {

    public static void main(String[] args) {
        PascalTriangle ob = new PascalTriangle();
        List<List<Integer>> sol = ob.getList(5);//n^2
        System.out.println(sol);
    }

    private List<List<Integer>> getList(int n) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        sub.add(1);
        ls.add(sub);
        if (n == 1) {
            return ls;
        }
        //n-1
        while (ls.size() < n) {
            sub = new ArrayList<>();
            //n
            for (int i = 0; i <= ls.getLast().size(); i++) {
                if (i == 0 || i == ls.getLast().size()) {
                    sub.add(1);
                } else {
                    int temp = ls.getLast().get(i) + ls.getLast().get(i - 1);
                    sub.add(temp);
                }
            }
            ls.add(sub);
        }
        return ls;
    }
}
