


public class Compare {
    
    public static <T extends Object> boolean compare(T[] arr1, T[] arr2) {
        if(arr1.length == arr2.length){
            for (int idx = 0; idx < arr1.length; idx++) {
                if(arr1[idx].getClass() != arr2[idx].getClass()){
                    return false;
                }  
            }
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        
        Object[] arr1 = new String[]{ "1","2","3","4"};
        Object[] arr2 = new Integer[]{1,2,3,4};
        Object[] arr4 = new Integer[]{7,2,9,4777,8};
        Object[] arr3 = new Cat[]{new Cat("1"),new Cat("2"),new Cat("3"),new Cat("4")};
        System.out.println(compare(arr2, arr3));
    }
}
class Cat{
    String name;
    Cat(String name){
        this.name = name;

    }
}
