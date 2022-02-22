package interfaces.callback;

public class Store {

    private IMembers[] members = new IMembers[100];
    int count = 0;


    public void register(IMembers m){
        members[this.count] = m;
        this.count += 1;
    }

    public void invite(){
        for(int i =0; i < count; i++){
            members[i].callback();
        }
    }
}
