package helloPackage;

import helloPackage.CreditCards.BronzeCreditCard;
import helloPackage.CreditCards.CreditCard;
import helloPackage.CreditCards.GoldCreditCard;
import helloPackage.CreditCards.SilverCreditCard;
import helloPackage.Offers.FoodOfferVisitor;
import helloPackage.Offers.HotelOfferVisitor;
import helloPackage.Offers.OfferVisitor;

public class Main {

    public static void main(String[] args) {
        OfferVisitor visitor = new FoodOfferVisitor();
        OfferVisitor visitor2 = new HotelOfferVisitor();

        CreditCard bronze = new BronzeCreditCard();
        CreditCard gold = new GoldCreditCard();
        CreditCard silver = new SilverCreditCard();

        //different cards interacting w/ offers
        //accepts any type of offer visitor
        //in this case a food offer
        bronze.accept(visitor);
        gold.accept(visitor);
        silver.accept(visitor);

        //computes gold card w/ a hotel offer
        //passing in a hotel visitor
        //gold interacting w/ hotel offer
        gold.accept(visitor2);
    }
}
