// Marcus Hilario 
// Shivansh Dutta

// *******************************************************************
// Coin.java Author: Lewis and Loftus
//
// Represents a coin with two sides that can be flipped.
// *******************************************************************
public class BiasedCoin
{

    private double bias;
    public final int HEADS = 0;
    public final int TAILS = 1;
    private int face;
    private double flipValue;
// ---------------------------------------------
// Sets up the coin by flipping it initially.
// ---------------------------------------------
public BiasedCoin ()
{
    bias = 0.5;
    flip();
}

public BiasedCoin(double newBias) {
    if(newBias >= 0 && newBias <= 1)
        bias = newBias;
    else
        bias = 0.5;
    flip();
}

// -----------------------------------------------
// Flips the coin by randomly choosing a face.
// -----------------------------------------------
public void flip()
{
    flipValue = Math.random();
    if(flipValue < bias)
        face = HEADS;
    else
        face = TAILS;
}

// -----------------------------------------------------
// Returns the current face of the coin as an integer.
// -----------------------------------------------------
public int getFace()
{
    return face;
}
// ---------------------------------------------------------
// Returns true if the current face of the coin is heads.
// ---------------------------------------------------------
public boolean isHeads()
{
    return (face == HEADS);
}
// ----------------------------------------------------
// Returns the current face of the coin as a string.
// ----------------------------------------------------
public String toString()
{
    String faceName;
    if (face == HEADS)
        faceName = "Heads";
    else
        faceName = "Tails";
    return faceName;
}
}