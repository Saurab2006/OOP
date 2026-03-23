package Tutorial1;

public class LogicalOperator {
	    public static void main(String[] args) {

	        boolean expr1 = (5 > 3);
	        boolean expr2 = (8 > 5);

	        System.out.println("Logical AND: " + (expr1 && expr2));

	        expr2 = (2 > 5);

	        System.out.println("Logical OR: " + (expr1 || expr2));

	        boolean expr3 = (!(5 == 10));
	        System.out.println("Logical NOT: " + expr3);
	    }
	}
