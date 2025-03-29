public class Lecture8 {
    public double average(int ... list)
    {
        return 0.2;
    }
    public static void main (String args[])
    {
        int[][] table = new int[12][50];

        for (int row = 0; row < table.length; row++)
            for (int col = 0; col < table[row].length; col++)
                table[row][col] = row * 10 + col;
    }
}

// Variable Length Parameter lists
// uses "..."
// additional parameters must be before the variable length parameter

// Two Dimensional Arrays
// similar to table of elements, with rows and columns

// declaration [rows, columns]
// int[][] table = new int[12][50]

// referencing
// value = table[3][6]

// rows can have different but fixed sizes "ragged arrays"
