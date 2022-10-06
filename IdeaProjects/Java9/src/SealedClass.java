sealed class Bakery permits Cakes, Croissants{
    int numOfPieces()
    {
        return 0;
    }
}

final class Cakes extends Bakery{
    public int numOfPieces()
    {
        return 4;
    }
}
sealed class Croissants extends Bakery permits ChocolateCroissants{
    public int numOfPieces()
    {
        return 2;
    }
}

non-sealed class ChocolateCroissants extends Croissants{
    public int numOfPieces()
    {
        return 1;
    }
}


public class SealedClass{

    public static void main(String[] args) {
        ChocolateCroissants chocolateCroissants=new ChocolateCroissants();
        Croissants croissants=new Croissants();
        Cakes cakes=new Cakes();
        System.out.println("Pieces served of cake: "+cakes.numOfPieces());
        System.out.println("Pieces served of croissants: "+croissants.numOfPieces());
        System.out.println("Pieces served of chocolate croissants: "+chocolateCroissants.numOfPieces());
    }

}
