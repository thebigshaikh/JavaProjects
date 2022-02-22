package interfaces.callback;

public class Customers implements IMembers{
    private String name;

    Customers(String name){
        this.name = name;
    }

    public void callback(){
        System.out.println("Okay I will come, "+this.name);
    }

}
