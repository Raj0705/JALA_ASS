public class String11 {
    //11.Splitting strings with split()
    
    public static void main(String[] args) {
        String str="I love Java Programming";
        String[] words=str.split("\\s");
        //split the string on the basis of whitespace
        System.out.println("Splitted string : ");
        for(String w:words)
        {
            System.out.println(w);
        }
    }
}
