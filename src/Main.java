import com.Siyar.exempel.models.Cat;
import com.Siyar.exempel.models.Dog;

public class Main {
    public static void main(String[] args) {


        //instanstiera objekt
        Cat kasper = new Cat(); //kasper är namn på katten
        Dog fido = new Dog(); //fido är namn på hunden



        /*börja använda våra objekt. När vi skriver kasper. så har vi tillgång till alla våra metoder.
      Så inkludera alla. */
        kasper.name();
        kasper.eat();
        kasper.move();
        kasper.sleep();
        kasper.makeSound();
        kasper.typeOfAnimal("Cat");  //Default metod

        fido.name();
        fido.eat();
        fido.move();
        fido.sleep();
        fido.makeSound();
        fido.typeOfAnimal("Dog");  //Default metod

        }
    }