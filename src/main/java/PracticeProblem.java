public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int[] createIntArray(){
        int[] arr = {1,2,3,4,5};
        return arr;
    }
    public static String[] createArray(String str1, String str2, String str3, String str4){
        String[] arr1 = new String[]{str1, str2, str3, str4};
        return arr1;
    }
    public static int findValue(int value, int  [] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
    public static int findThirdValue(String value, String[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(value)){
                count++;
            }
            if (count == 3) {
                return i;
            }
        }
        return -1;
    }

}
