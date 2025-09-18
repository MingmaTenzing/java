class usersystem {
    

    public void regsiter() {

        System.out.println("registerdd users");
    }
}



class admin {

    private usersystem regsiteruser;



    public admin(usersystem inputuser) {
        this.regsiteruser = inputuser;

    }

    public void printUser() {


        regsiteruser.regsiter();
    }

}


public class beans {

    public static void main(String[] args) {
        

        usersystem myusersystem = new usersystem();
        myusersystem.regsiter();


        admin newAdmin = new admin(myusersystem);
        newAdmin.printUser();

    }
    
}
