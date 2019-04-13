package helloPackage.Offers;

import helloPackage.CreditCards.BronzeCreditCard;
import helloPackage.CreditCards.GoldCreditCard;
import helloPackage.CreditCards.SilverCreditCard;

public interface OfferVisitor {
	void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard);
	void visitGoldCreditCard(GoldCreditCard goldCreditCard);
	void visitSilverCreditCard(SilverCreditCard silverCreditCard);

}
