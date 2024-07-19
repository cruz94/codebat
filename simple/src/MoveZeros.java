import java.util.ArrayList;
import java.util.List;

public class MoveZeros {

    public int[] moveZeros( int[] n) {
        int j = n.length-1;
            for(int i = 0; i<n.length;i++){
                if(i<j){
                    if(n[j] == 0){
                        j--;
                    }
                    if(n[i] == 0 && n[j] != 0) {
                            int temp = n[j];
                            n[j] = n[i];
                            n[i] = temp;
                            j--;
                    }
                }
            }
            return n;
    }
}


