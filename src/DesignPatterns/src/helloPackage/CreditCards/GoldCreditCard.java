package helloPackage.CreditCards;


import helloPackage.Offers.OfferVisitor;

public class GoldCreditCard implements CreditCard{


	@Override
	public String getName() {
		return "This is the Gold offer";
	}

	@Override
	public void accept(OfferVisitor offerVisitor) {
		offerVisitor.visitGoldCreditCard(this);

	}
}
