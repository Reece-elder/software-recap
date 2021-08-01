public class Shark extends Fish {

    private string dangerRating = "very high";

    private boolean eatsFish = true;

    public void sharkTraits(){
        syso("Eats fish: " + this.eatsFish + " , Swims: " + super.getSwim() + " , Danger Rating: " + this.dangerRating());
    }

       public static void (){
        System.out.println("dun dun.. dun dun.. dun dun dun dun dun.. ");
    }

}