import java.util.Comparator;

public class Util {

    public static  <T> void sort(T [] arr, Comparator<T> c){

        int passes = arr.length-1;
        int compare = arr.length-1;

        for(int i =0;i<passes;i++){
            for(int j=0;j<(compare-i);j++){
                if(c.compare(arr[j],arr[j+1])==1){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
