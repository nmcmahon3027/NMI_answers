package helloPackage.CreditCards;

import helloPackage.Offers.OfferVisitor;

public class BronzeCreditCard implements CreditCard {
	@Override
	public String getName() {
		return "This is the Bronze offer";
	}

	@Override
	public void accept(OfferVisitor offerVisitor) {
		offerVisitor.visitBronzeCreditCard(this);

	}
}
