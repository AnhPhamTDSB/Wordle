public class JavaVar {
//datatypes
//class level vars
  public static void main(String[] args) throws Exception {
    //datatypes varName [=value];
    int games = 3;
    double allowance = 40.50;
    long battlepass; //We define battlepass

    battlepass = 15;// We aasign a value to battle pass
    // Print out our var values along with a string that explains our value
    System.out.println("Number of games I own = " + games);
    System.out.println("My monthly allowance = " + allowance);
    System.out.println("Cost of a single batlle pass = " + battlepass);
 //With our current allowance, how many battle pass will we be able to buy?
    //ANSWER: With our allowance we could buy 2 battle passes. Each one cost $15. and we have a budget of 40.50. So we should divide the budget with the cost to get the amount we can afford. $40.50/15 = 2.7
      //What is the total cost of battle passes
    // The cost of one battle pass is $15, andwe can afford 2 of them. TO calculate the cost of the passes, we should multiply the cost with the amount can buy. $15 x 2 = $30.
    }
}
