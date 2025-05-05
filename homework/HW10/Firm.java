package homework.HW10;
//*****************************************************************
// Firm.java Author: Lewis/Loftus
//
// Demonstrates polymorphism via inheritance.
// ****************************************************************
public class Firm {
    // --------------------------------------------------------------
    // Creates a staff of employees for a firm and pays them.
    // --------------------------------------------------------------
    public static void main(String[] args) throws BonusTooHighException{
        Staff personnel = new Staff();
        personnel.vaycay();
    }
}