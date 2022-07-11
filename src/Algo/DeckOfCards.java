package Algo;

public class DeckOfCards {
        
    public static void main(String[] args) {
        String[] suit = {"spades", "Hearts", "Diamonds", "clubs"};
        String[] rank = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King"};
        int[] deck = new int[52];
        
        //initialize the cars 
        for(int i = 0; i < deck.length; i++){
           deck[i] = i;
           System.out.println("deck["+(i+1)+"] = "+deck[i]+" ");
        }
        //shuffle the cars randomly
        for(int i = 0; i < deck.length; i++){
            int randIndex = (int)(Math.random()* deck.length);
            //swap numbers
            int temp = deck[i];
            deck[i] = deck[randIndex];
            deck[randIndex] = temp;
        }
        //picking the first 4 cards
        for(int i = 0; i < 4; i++){
            System.out.println("cardNuo "+ deck[i]+":");
            System.out.println(rank[deck[i] % 13]+" of ");
            System.out.println(suit[deck[i] / 13]+"");
        }
    }
}
