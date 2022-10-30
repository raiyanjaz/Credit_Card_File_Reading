# Code Description
**The Credit River Credit Card Company has a file that called “ledger.dat” which contains the following information for 40
of its customers:**
      Account number of type string (a “B” followed by a 5-digit number)
      The starting Balance of type double
      The most recent Purchase of type double
      The most recent Payment of type double
      
As required by Java, the fields are separated by spaces, so you can use the Scanner object.

The company charges 28% of the starting balance (compounded monthly) for finance charges. This is done before
applying the other transactions. “Compounded monthly” means that the interest for the current month is really 0.28
divided by 12 (for each month of the year). We are only concerned about the current month.

Write a Java program that does the following:
      Read in the file, calculates the interest per customer and adds it to their balance owing
      Display all information to the console including finance charge and outstanding balance for each account 
      Creates an output file called “NewBalance.dat” that contains customer number and new balance (two columns)
      OR sends the output (account number and new balance) to standard output.
