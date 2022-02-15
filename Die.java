//Name: Vinith Nair
//Student id: A00241282
//Description: This code defines the various parameterized and the default constructors and a roll method to generate a random number facing the upper side on the dice.


//importing util pacage
import java.util.*;

public class Die{

  //declaring the variables
  public String name;
  public int sides;
  public int currentSideUp;

//default constructor with 0 arguements
public Die(){
  name = "d6";
  sides = 6;
}

//coonnstructor with number of sides as the only arguement
public Die(int sides){
  this.sides = sides;
  name = "d"+this.sides+"";

}

//constructor with number of sides and name as the arguements
public Die(String name, int sides){
  this.name = name;
  this.sides = sides;

}

//defining the get methods
public String getName(){
  return name;
}
public int getSides(){
  return sides;
}

//defining th4e roll method
public void roll(){
    System.out.println("Rolling the "+this.getName());
    int max = this.getSides();

    //calculating the current side up
    currentSideUp =  ((int) ((Math.random() * (max - 1)) + 1));
    System.out.println("The new value is " + currentSideUp);


}
}
