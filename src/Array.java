public class Array {
    private  int[] array;
    private  int nElements;

    public Array(int max){
        array = new int [max];
        nElements = 0;
    }

    public  void  display(){
        for(int i=0; i<nElements; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
