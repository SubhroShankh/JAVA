class ArrayToString{
    public static void main (String[] args) {
        String[] arr = new String[] {"hello!", "world", "Nice", "to", "meet", "you"};
        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(str).append(" ");
        }
        System.out.print(sb);
    }
}