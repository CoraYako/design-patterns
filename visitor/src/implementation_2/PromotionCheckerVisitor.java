package implementation_2;

public class PromotionCheckerVisitor implements Visitor {
    @Override
    public void visitTheElement(SeniorEmployee employee) {
        boolean eligibleForPromotion = employee.getExperience() > 15;
        System.out.println("\t\t" + employee.getName() + " is eligible for promotion? " + eligibleForPromotion);
    }

    @Override
    public void visitTheElement(JuniorEmployee employee) {
        boolean eligibleForPromotion = employee.getExperience() > 5;
        System.out.println("\t\t" + employee.getName() + " is eligible for promotion? " + eligibleForPromotion);
    }
}
