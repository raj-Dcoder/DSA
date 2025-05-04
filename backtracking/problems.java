package backtracking;

public class problems {
    //array print method
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void fillemptyarray(int[] arr, int index){
        if(index >= arr.length){
            printArray(arr);
            return;
        }
        arr[index]=index+1;
        fillemptyarray(arr, index+1);
        arr[index]-=2;
    }

    // Print subsets of a string 
    static void printSubsets(String str, int indx, StringBuilder ans){
        // Breaking Condition
        if(indx == str.length()){
            if(ans.length() == 0)
                System.out.println("null");
            else
                System.out.println(ans);

            return;
        }
        printSubsets(str, indx+1, ans.append(str.charAt(indx)));
        ans.deleteCharAt(ans.length()-1);
        printSubsets(str, indx+1, ans);
    }
    public static void main(String[] args) {
        
        printSubsets("abc", 0,  new StringBuilder());
    }
}
