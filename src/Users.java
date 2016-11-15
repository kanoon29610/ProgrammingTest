import java.util.ArrayList;

public class Users {
    // User repository
    private ArrayList<IUser> userList;

    // Create new user with type, name and password
    public Users ()
    {
        userList = new ArrayList<IUser>();
    }
    // user created with this method should be automatically added to userList;
    public IUser create(int type, String name, String password) {

        IUser newuser = new User(type,name,password);
        userList.add(newuser);
        return newuser;
    }

    // Add new user to repository
    public void add(IUser user) {
        userList.add(user);
    }

    public void add(int type,String username , String password)
    {
        User newuser = new User(type , username , password);
        userList.add(newuser);

    }

    // Delete user from repository
    // Throw  RuntimeException if the user is not in the list
    public void remove(IUser user) throws RuntimeException {
        if(userList.size() < 1 )
            throw new RuntimeException("Empty User in list");
        userList.remove(user);
    }

    // Return true if the user is in the list
    public boolean exists(IUser user)
    {
        if(userList.size() == 0 )
            throw new RuntimeException("Empty User in list");
        for(IUser users : userList)
        {
            if(users.getName().equals(user))
                return true;
        }
        return false;
    }

    // Return number of user in the list
    public int count() {
        if(userList.size() ==0 )
            throw new RuntimeException("Empty User in list");
        return userList.size();
    }

    // Return number of user in the list, according to type
    public int countByType(int type)
    {
        if(userList.size() == 0 )
            throw new RuntimeException("Empty User in list");
        int count=0;
        for (IUser users : userList)
        {
            if(users.getType() == type) count++;
        }
        return count;
    }
}
