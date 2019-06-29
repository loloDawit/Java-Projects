public class Main {

    public static void main(String[] args) {
        Array array = new Array(100);
        array.insert(10);
        array.insert(20);
        array.insert(1);
        array.insert(2);
        array.display();
        int key = 10;
        int found = array.binarySearch(key);
        if(found == key){
            System.out.println("Found "+found);
        }else{
            System.out.println("Opps...");
        }

    }
}
