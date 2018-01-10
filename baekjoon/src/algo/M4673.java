package algo;

//4673. 셀프넘버
//https://www.acmicpc.net/problem/4673

public class M4673 {

    public static void main(String[] args) {

    	int[] array = new int[10001];
    	
    	for (int i = 1;i <= 10000;i++) {
    		int D = getD(i);
    		if (D <= 10000) {
    			array[D]++;
    		}
    	}
    	
    	for (int i = 1;i <= 10000;i++) {
    		if (array[i] == 0) {
    			System.out.println(i);
    		}
    	}
    }
    
    static int getD(int arg) {
    	int result = arg;
    	
    	while (arg > 0) {
    		result = result + (arg %10);
    		arg /= 10;
    	}
    	return result;
    	
    }
}
