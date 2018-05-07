public class CardDeck {

    public static void main(String[] args) {

        String[] suit = {"Spades", "Diamonds", "Clubs", "Hearts"};
        String[] rank = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
        String[] deck = new String[52];
        String[][] classLevel = new String[4][5];
        int[] cardNum = new int[52];


        for (int i = 0; i < deck.length; i += 1) {
            cardNum[i] = i;
        }

        for (int i = 0; i < deck.length; i += 1) {
            int forShuffle = shuffle();
            int forCards = cardNum[i];
            cardNum[i] = cardNum[forShuffle];
            cardNum[forShuffle] = forCards;
        }

        for (int i = 0; i < deck.length; i += 1) {
            String allSuit = suit[cardNum[i] / 13];
            String allRank = rank[cardNum[i] % 13];
            deck[i] = allRank + " of " + allSuit;
            System.out.println("Hand " + cardNum[i]+ ": " + allRank + "/" + allSuit);
        }

        for (int i = 0; i <= 4; i += 1) {
            classLevel[0][i] = deck[i];
            classLevel[1][i] = deck[i];
            classLevel[2][i] = deck[i];
            classLevel[3][i] = deck[i];
        }
        System.out.println(classLevel);
    }
    private static int shuffle() {
        int mult = 50;
        return (int)(Math.floor(Math.random()*mult) + 1);
    }
}
