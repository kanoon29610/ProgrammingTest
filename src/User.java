public class User implements IUser {

    protected String name;
    protected String password;
    protected int type;

    User(int type, String name, String password){

        setType(type);
        setName(name);
        setPassword(password);
    }

    @Override
    public String getName() {

        if(this.name == ""){
            throw new RuntimeException("Name is empty. Please set your name.");
        }
        return this.name;
    }

    @Override
    public String setName(String name) {

        if(name == "" ){
           throw new RuntimeException("Please input your name.");
       }
        this.name = name;
        return this.name;
    }

    @Override
    public String setPassword(String password) {

        if(password == ""){
            throw new RuntimeException("Please input your password.");
        }
        this.password = password;
        return this.password;
    }

    @Override
    public boolean isPasswordCorrect(String password) {

        if(password == this.password){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public int setType(int type) {
        if(type != 1 && type != 2){
            throw new RuntimeException("Your type is wrong.");
        }
        this.type = type;
        return  this.type;
    }
}
