public class PositionOfChar {
    //use of charAt();
    public static void PrintAllCharacterOfString(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        String  nam="raj kumar";
          PrintAllCharacterOfString(nam);

    }
    
}
