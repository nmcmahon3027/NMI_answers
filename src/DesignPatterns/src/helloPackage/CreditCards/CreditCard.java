package helloPackage.CreditCards;

import helloPackage.Offers.OfferVisitor;

public interface CreditCard {
	String getName();
	void accept(OfferVisitor offerVisitor);

}
