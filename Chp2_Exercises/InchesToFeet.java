class InchesToFeet
{
    public static void main(String[] args) {
        final int INCHES_IN_A_FOOT = 12;
        int inches = 86;
        int feet;
        int inchesLeft;
        feet = inches / INCHES_IN_A_FOOT;
        inchesLeft = inches % INCHES_IN_A_FOOT;
        System.out.println(inches + " inches becomes " + feet + " feet and " + inchesLeft + " inches.");
    }
}
