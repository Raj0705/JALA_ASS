interface Mango{
    void show();
}
class Fruit implements Mango
{
    public void show()
    {
        System.out.println("Hey!!I am interface Mango");
    }
}

public class Interface3 {

    public static void main(String[] args) {
        Mango m=new Fruit();
  m.show();
    
}
}
