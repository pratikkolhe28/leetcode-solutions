class Solution {
    public boolean canAliceWin(int n) {
        int stonesToRemove = 10;
        boolean aliceTurn = true;

        while (n >= stonesToRemove) {
            n -= stonesToRemove;
            stonesToRemove--;
            aliceTurn = !aliceTurn;
        }

        // If it's Bob's turn now, Alice made the last valid move and wins.
        return !aliceTurn;
    }
}
