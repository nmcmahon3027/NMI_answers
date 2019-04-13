package helloPackage.Offers;

import helloPackage.CreditCards.BronzeCreditCard;
import helloPackage.CreditCards.GoldCreditCard;
import helloPackage.CreditCards.SilverCreditCard;

public class HotelOfferVisitor implements OfferVisitor {
	@Override
	public void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard) {
		System.out.println("BRONZE Hotel Offer");

	}

	@Override
	public void visitGoldCreditCard(GoldCreditCard goldCreditCard) {
		System.out.println("GOLD Hotel Offer");

	}

	@Override
	public void visitSilverCreditCard(SilverCreditCard silverCreditCard) {
		System.out.println("SILVER Hotel Offer");

	}
}
