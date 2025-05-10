public class test {
    public static int[] eStatistics(String[] names) {
        int[] returnArray = new int[names.length];
        String name;
    
        for(int i = 0; i<names.length; i++) {
            name = names[i];
            returnArray[i] = 0;
            for(int j = 0; j<name.length(); j++) {
                if(name.charAt(j) == 'e') {
                    returnArray[i]++;
                }
            }
        }
        return returnArray;
    }

    private static int recProd(int[] array, int count) {
    if(count <= 0) {
        return 1;
    }
    else {
        return recProd(array, count-1) * array[count-1];
    }
}

    public static void main (String[] args) {
        int[] arr = eStatistics(new String[] {"monday", "tuesday", "wednesday", "thursday"});
        for(int num : arr) {
            System.out.println(num);
        }

        System.out.println(recProd(new int[] {1,2,3,4,5}, 4));
    }

}
