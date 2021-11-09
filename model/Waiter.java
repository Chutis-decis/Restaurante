package model;
public class Waiter extends Person {
    private int id; 
    
    public  Waiter(String email, String name, int id){
        super (email,name);
        this.id=id+1;
    }

    public int getId (){
        return id;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + '}';
    }
    public void Platillos(){
        System.out.println("Elija que platillo va a llevar");
    }
}
