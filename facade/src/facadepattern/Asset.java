package facadepattern;

public class Asset {
    public boolean hasSufficientAssetValue(Person person, double claimAmount) {
        System.out.println("Verifying " + person.name + "'s asset value.");
        return person.assetValue >= claimAmount;
    }
}
