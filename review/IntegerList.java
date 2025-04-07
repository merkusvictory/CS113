public class IntegerList {
    private int[] list;

    public IntegerList(int listSize) {
        list = new int[listSize];
    }

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public void randomize() {
        for(int i = 0; i < list.length; i++) {
            list[i] = (int)Math.random()*100 + 1;
        }
    }

    public String toString() {
        String output = "";
        for(int num : list) {
            output += num + " ";
        }
        return output;
    }

    public int[] merge(int[] list2) {
        int[] outputList = new int[list.length + list2.length];
        for(int i = 0; i < list.length; i++) {
            outputList[i] = list[i];
        }
        for(int i = list.length; i < outputList.length; i++) {
            outputList[i] = list2[i-list.length];
        }
        return outputList;
    }
}
