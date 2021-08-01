public class Shark extends Fish {

    private string scaleColour = "golden orange";

    public void sharkTraits(){
        syso("scale Colour: " + this.scaleColour + " , Swims: " + super.getSwim());
    }

}