package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

import PokerBase.Card;
import PokerBase.Hand;
import pockerEnums.eHandStrength;
import pockerEnums.eRank;
import pockerEnums.eSuit;

public class HandTest {

	@Test
	public void TestRoyalFlush() {
		
		ArrayList<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card(eSuit.CLUBS,eRank.TEN,0));
		royalFlush.add(new Card(eSuit.CLUBS,eRank.JACK,0));
		royalFlush.add(new Card(eSuit.CLUBS,eRank.QUEEN,0));
		royalFlush.add(new Card(eSuit.CLUBS,eRank.KING,0));
		royalFlush.add(new Card(eSuit.CLUBS,eRank.ACE,0));
		
		Hand h = new Hand();
		
		h = Hand.EvalHand(royalFlush);
		
		assertTrue(eHandStrength.RoyalFlush.getHandStrength() == h.getHandStrength());
	}

	@Test
	public void TestFlush() {
		
		ArrayList<Card> flush = new ArrayList<Card>();
		flush.add(new Card(eSuit.CLUBS,eRank.FOUR,0));
		flush.add(new Card(eSuit.CLUBS,eRank.EIGHT,0));
		flush.add(new Card(eSuit.CLUBS,eRank.TEN,0));
		flush.add(new Card(eSuit.CLUBS,eRank.JACK,0));
		flush.add(new Card(eSuit.CLUBS,eRank.KING,0));
		
		Hand h = new Hand();
		
		h = Hand.EvalHand(flush);
		
		assertTrue(eHandStrength.Flush.getHandStrength() == h.getHandStrength());
	}
	
	@Test
	public void TestStraight() {
		
		ArrayList<Card> straight = new ArrayList<Card>();
		straight.add(new Card(eSuit.HEARTS,eRank.FOUR,0));
		straight.add(new Card(eSuit.HEARTS,eRank.FIVE,0));
		straight.add(new Card(eSuit.CLUBS,eRank.SIX,0));
		straight.add(new Card(eSuit.DIAMONDS,eRank.SEVEN,0));
		straight.add(new Card(eSuit.SPADES,eRank.EIGHT,0));
		
		Hand h = new Hand();
		
		h = Hand.EvalHand(straight);
		
		assertTrue(eHandStrength.Straight.getHandStrength() == h.getHandStrength());
	}
	
	@Test
	public void TestFourOfAKind() {
		
		ArrayList<Card> fourOfAKind = new ArrayList<Card>();
		fourOfAKind.add(new Card(eSuit.CLUBS,eRank.JACK,0));
		fourOfAKind.add(new Card(eSuit.HEARTS,eRank.JACK,0));
		fourOfAKind.add(new Card(eSuit.SPADES,eRank.JACK,0));
		fourOfAKind.add(new Card(eSuit.DIAMONDS,eRank.JACK,0));
		fourOfAKind.add(new Card(eSuit.CLUBS,eRank.KING,0));
		
		Hand h = new Hand();
		
		h = Hand.EvalHand(fourOfAKind);
		
		assertTrue(eHandStrength.FourOfAKind.getHandStrength() == h.getHandStrength());
	}
	
	@Test
	public void TestFullHouse() {
		
		ArrayList<Card> fullHouse = new ArrayList<Card>();
		fullHouse.add(new Card(eSuit.CLUBS,eRank.FOUR,0));
		fullHouse.add(new Card(eSuit.HEARTS,eRank.FOUR,0));
		fullHouse.add(new Card(eSuit.DIAMONDS,eRank.FOUR,0));
		fullHouse.add(new Card(eSuit.CLUBS,eRank.FIVE,0));
		fullHouse.add(new Card(eSuit.DIAMONDS,eRank.FIVE,0));
		
		Hand h = new Hand();
		
		h = Hand.EvalHand(fullHouse);
		
		assertTrue(eHandStrength.FullHouse.getHandStrength() == h.getHandStrength());
	}
	
	@Test
	public void TestThreeOfAKind() {
		
		ArrayList<Card> threeOfAKind = new ArrayList<Card>();
		threeOfAKind.add(new Card(eSuit.DIAMONDS,eRank.TEN,0));
		threeOfAKind.add(new Card(eSuit.CLUBS,eRank.TEN,0));
		threeOfAKind.add(new Card(eSuit.HEARTS,eRank.TEN,0));
		threeOfAKind.add(new Card(eSuit.CLUBS,eRank.JACK,0));
		threeOfAKind.add(new Card(eSuit.SPADES,eRank.KING,0));
		
		Hand h = new Hand();
		
		h = Hand.EvalHand(threeOfAKind);
		
		assertTrue(eHandStrength.ThreeOfAKind.getHandStrength() == h.getHandStrength());
	}
	
	@Test
	public void TestTwoPair() {
		
		ArrayList<Card> twoPair = new ArrayList<Card>();
		twoPair.add(new Card(eSuit.CLUBS,eRank.FOUR,0));
		twoPair.add(new Card(eSuit.SPADES,eRank.FOUR,0));
		twoPair.add(new Card(eSuit.CLUBS,eRank.TEN,0));
		twoPair.add(new Card(eSuit.HEARTS,eRank.TEN,0));
		twoPair.add(new Card(eSuit.CLUBS,eRank.KING,0));
		
		Hand h = new Hand();
		
		h = Hand.EvalHand(twoPair);
		
		assertTrue(eHandStrength.TwoPair.getHandStrength() == h.getHandStrength());
	}
	
	@Test
	public void TestPair() {
		
		ArrayList<Card> pair = new ArrayList<Card>();
		pair.add(new Card(eSuit.CLUBS,eRank.FOUR,0));
		pair.add(new Card(eSuit.CLUBS,eRank.EIGHT,0));
		pair.add(new Card(eSuit.CLUBS,eRank.TEN,0));
		pair.add(new Card(eSuit.CLUBS,eRank.JACK,0));
		pair.add(new Card(eSuit.CLUBS,eRank.KING,0));
		
		Hand h = new Hand();
		
		h = Hand.EvalHand(pair);
		
		assertTrue(eHandStrength.Pair.getHandStrength() == h.getHandStrength());
	}
	
	@Test
	public void TestHighCard() {
		
		ArrayList<Card> highCard = new ArrayList<Card>();
		highCard.add(new Card(eSuit.CLUBS,eRank.FOUR,0));
		highCard.add(new Card(eSuit.CLUBS,eRank.EIGHT,0));
		highCard.add(new Card(eSuit.CLUBS,eRank.TEN,0));
		highCard.add(new Card(eSuit.CLUBS,eRank.JACK,0));
		highCard.add(new Card(eSuit.CLUBS,eRank.KING,0));
		
		Hand h = new Hand();
		
		h = Hand.EvalHand(highCard);
		
		assertTrue(eHandStrength.HighCard.getHandStrength() == h.getHandStrength());
	}
}
