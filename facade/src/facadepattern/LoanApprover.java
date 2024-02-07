package facadepattern;

public class LoanApprover {
    Asset asset;
    LoanStatus loanStatus;

    public LoanApprover() {
        asset = new Asset();
        loanStatus = new LoanStatus();
    }

    public String CheckLoanEligibility(Person person, double claimAmount) {
        String status = " Approved";
        String reason = "";
        System.out.println("\nChecking the loan approval status of " + person.name);
        System.out.println("[The current asset value: " + person.assetValue + ",\n claim amount: " + claimAmount +
                ",\n existing loan?: " + person.previousLoanExist + "]\n");
        if (!asset.hasSufficientAssetValue(person, claimAmount)) {
            status = " Not approved.";
            reason += "\nInsufficient balance.";
        }
        if (loanStatus.hasPreviousLoans(person)) {
            status = " Not approved.";
            reason += "\nAn old loan exists.";
        }
        // Collecting the remarks (if any).
        String remarks = String.format("%nRemarks if any: %s", reason);
        // Combining the final result with remarks using
        // the format() method.
        String result = String.format("%s %s", status, remarks);
        // Same as:
        // String result=status+"\nRemarks if any:"+reason;
        return result;
    }
}
