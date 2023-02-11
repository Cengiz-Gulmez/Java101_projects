package Ilkpaket;
import java.util.Arrays;

public class TekrarEden {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i==value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list={12,15,6,12,6,89,65,3,6,12,89,14,13,1,3,};
        int[] dublicate=new int[list.length];
        int index=0;

        for (int i=0;i<list.length;i++){
            for (int j=0; j<list.length;j++){
                if (i != j && list[i]==list[j]){
                    if (!isFind(dublicate,list[i])) {
                        if (list[i]%2==0) {
                            dublicate[index++] = list[i];
                        }
                    }
                    break;
                }
            }

        }
        for (int k : dublicate){
            if (k !=0){
                System.out.println(k);
            }
        }
    }
}
