package model;
public class User extends Person{
    
    private int id; 
    
    public User (String email, String name){
        super (email,name);
        System.out.println("El usuario: " + name + "\nCon un email: " + email);
    }
    public int getId (){
        return id;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + '}';
    }
    public void Platillos(){
        System.out.println("Selecccione que platillo, postre y bebida\n va a querer");
    }
    
}
