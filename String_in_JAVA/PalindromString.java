public class PalindromString {
    public static boolean  palindrom(String name){
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
                return false;
                

            }
        }
        return true;
    }
    public static void main(String args[]){
        String nam="noon";
       System.out.println(palindrom(nam));

    }
}
