public class Array {
    public static void main(String[] args) {
        /*int[] myArr = new int[5];
        myArr[0] = 98; 
        myArr[1] = 56;
        myArr[3] = 95;
        myArr[2] = 73;
        myArr[4] = 564; */

        int[] myArr = {1,9,3,4,5};
        //int index = 2;
        
        /*System.out.println(myArr[0]);
        System.out.println(myArr[index]);
        System.out.println(myArr[1]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]); */

        // Array Traversal
        int index =0;
        while (index<5 /*or we can write index < myArr.length */) {
            System.out.println(myArr[index]);
            index++;
        }

        String[] arr = new String[5];
        arr[0] = "Hello!";
        
        String[] mArr = {"FIRST" , "SECOND" ,"THIRD"};
        System.out.println(mArr.length);
    }
}
