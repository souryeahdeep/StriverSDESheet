package StriverSDESheet;
import java.util.*;
public class RepeatMissing {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        int[] arn=new int[]{3,1,2,5,4,6,7,5};
        boolean[] val=new boolean[arn.length+1];
        for (int i = 0; i < arn.length; i++) {
            if (!val[arn[i]]){
                val[arn[i]]=true;
            }
            else{
                list.add(arn[i]);
            }
        }
        for(int i=1;i< val.length;i++){
            if(!val[i]){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
