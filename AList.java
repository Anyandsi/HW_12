public class AList {

    private int initialSize;
    private int size = 0;
    private float maxLoad = 0.8f;
    private float minLoad = 0.6f;
    private int[] array;
    private static final int MIN_SIZE = 10;

    public AList() {
        this.initialSize = 10;
        this.array = new int[initialSize];
    }

    public AList(int initialSize) {
        this.initialSize = initialSize;
        this.array = new int[initialSize];
    }

    public int size() {
        return size;
    }

    public void add(int n) {
        float currentLoad = size / (initialSize * 1.0f);
        if (currentLoad >= maxLoad) {
            initialSize = (int) (size * 1.5);
            int[] tmp = new int[initialSize];

            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }
        array[size++] = n;
    }

    public void remove() {
        if (size > 0) {
            array[--size] = 0;
        }
        float currentLoad = size / initialSize;
        if (currentLoad <= minLoad && array.length > MIN_SIZE) {
            initialSize = (int) (size * 1.5);
            int[] tmp = new int[initialSize];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) throw new IllegalArgumentException();
        return array[index];
    }

    public int getArrayLength() {
        return array.length;

    }

    public void addFirstElement(int n){

            int[] tmp = new int[initialSize];
            for (int i = 1; i < size + 1; i++) {
                tmp[i] = array[i - 1];
            }
            tmp[0] = n;
            array = tmp;
    }

    public void removeFirstElement(){
        if(array[9] != 0){
            add(0);
        }
        int[] tmp = new int[initialSize];
        for (int i = 1; i < size + 1; i++) {
            tmp[i-1] = array[i];
        }
        array = tmp;
    }

    public void addNewElementToList(int index, int n){
        if(array[9] != 0){
                add(0);
        }
        int[] tmp = new int[initialSize];
        for(int i = 0; i < index; i++){
            tmp[i] = array[i];
        }
        tmp[index] = n;
        for(int i = index + 1; i < initialSize + 1; i++){
            tmp[i] = array[i];
        }
        array = tmp;

    }

    public int indexOf(int n){
        int index = 0;
        for(int i = 0; i < initialSize; i++){
            if(array[i] == n){
                index = i;
            }
        }
        if(index == 0) index = -1;
        return index;
    }

    public String separate(String sp){
        String separetedList = "";
        String[] tmp = new String[initialSize];
        for(int i = 0; i < initialSize; i++){
            tmp[i] = array[i] + sp + " ";
        }
        for(int i = 0; i < initialSize; i++){
            separetedList += tmp[i];
        }
        return separetedList;
    }

    public void sortAscending() {
        for (int i = 1; i < initialSize; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int tmp = get(j - 1);
                array[j] = tmp;
                tmp = get(j);
                array[j - 1] = tmp;
            }
        }
    }


}
