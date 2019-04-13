package helloPackage.Offers;

import helloPackage.CreditCards.BronzeCreditCard;
import helloPackage.CreditCards.GoldCreditCard;
import helloPackage.CreditCards.SilverCreditCard;

public class FoodOfferVisitor implements OfferVisitor {

	@Override
	public void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard) {
		System.out.println("BRONZE FOOD offer");

	}

	@Override
	public void visitGoldCreditCard(GoldCreditCard goldCreditCard) {
		System.out.println("GOLD FOOD Offer");

	}

	@Override
	public void visitSilverCreditCard(SilverCreditCard silverCreditCard) {
		System.out.println("SILVER FOOD Offer");

	}
}
