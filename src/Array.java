import org.jetbrains.annotations.Contract;

public class Array {
    private  int[] array;
    private  int nElements;

    @Contract(pure = true)
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
    public  void  insert(int value){
        array[nElements] = value;
        nElements++;
    }
    public void delete(int key){
        int i;
        for(i=0; i<nElements; i++){
            if(array[i] == key);
            break;
        }
        if(i == nElements){
            System.out.println("Opss... can't find " + key);
        }else {
            for(int k=i; k<nElements;k++){
                array[k] = array[k+1];
                nElements--;
            }
        }
        display();
    }
    public  int binarySearch(int keySearch){
        int lowerBound = 0;
        int upperBound = nElements -1;
        int currentIndex;
        while (true){
            currentIndex = (lowerBound + upperBound)/2;
            if(array[currentIndex] == keySearch){
                return array[currentIndex];
            }else if(lowerBound > upperBound){
                return nElements;
            }else {
                if(array[currentIndex] < keySearch){
                    lowerBound = currentIndex + 1;
                }else {
                    upperBound =currentIndex -1;
                }
            }
        }
    }

}
