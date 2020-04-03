public class Card {private int value;

    private String suit;

    private String cardRank;

// default constructor

    public Card() {

        value=1;

        suit="Spades";

        cardRank="Ace";

    }

// method to get the value of card

    public int getValue() {

        return value;

    }

// method to set card value and card rank

    public void setValue(int value) {

        if(value>=1 && value<=13) {

            this.value = value;

            if(value==1)

                cardRank="Ace";

            else

            if(value>=2 && value<=10)

                cardRank=value+"";

            else

            if(value==11)

                cardRank="Jack";

            else

            if(value==12)

                cardRank="Queen";

            else

            if(value==13)

                cardRank="King";

        }

    }

// method to get the suit

    public String getSuit() {

        return suit;

    }

// method to set the suit

    public void setSuit(String suit) {

        if(suit.equalsIgnoreCase("Spades") || suit.equalsIgnoreCase("Hearts") || suit.equalsIgnoreCase("Diamonds") || suit.equalsIgnoreCase("Clubs")) {

            this.suit = suit;

        }

    }

// method to get the card rank

    public String getCardRank() {

        return cardRank;

    }

    @Override

    public String toString() {

        return "Card [Value=" + value + ", Suit=" + suit + ", Card Rank=" + cardRank + "]";

    }

}

