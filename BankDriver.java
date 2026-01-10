import java.util.Scanner;

class BankDriver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter IFSC Code: ");
        int ifsc = sc.nextInt();

        System.out.print("Enter Account Balance: ");
        int bal = sc.nextInt();

        Bank b = new Bank(accNum, name, ifsc, bal);

        System.out.println("========= Account Details =========");
        System.out.println("Account Number: " + b.getAccNum());
        System.out.println("Account Holder Name: " + b.getName());
        System.out.println("IFSC Code: " + b.getIfsc());
        System.out.println("Account Balance: " + b.getBal());

        // Update name
		System.out.print("Do you want to update name? (Y/N): ");
		sc.nextLine();
		String ans = sc.nextLine();
		if(ans.equalsIgnoreCase("y"))
		{
			System.out.print("\nEnter new name: ");
			String newName = sc.nextLine();

			System.out.print("Enter account number to verify: ");
			int checkAcc = sc.nextInt();
			sc.nextLine();

			b.setName(newName, checkAcc);

			System.out.println("Updated Name: " + b.getName());
		}
		else
		{
			System.out.println("Okay");
		}
		System.out.print("Do you want to update balance? (Y/N): ");
		String ans1 = sc.nextLine();
		if(ans1.equalsIgnoreCase("y"))
		{
			System.out.print("\nEnter new balance: ");
			int newBal = sc.nextInt();

			System.out.print("Enter account number to verify: ");
			int checkAcc = sc.nextInt();

			b.setBal(newBal, checkAcc);

			System.out.println("Updated Name: " + b.getBal());
		}
		else
		{
			System.out.println("Okay");
		}
		
		if((ans.equalsIgnoreCase("y")) || (ans1.equalsIgnoreCase("y")))
		{
			System.out.println("========== Updated Account Details ==========");
			System.out.println("Account Number: " + b.getAccNum());
			System.out.println("Account Holder Name: " + b.getName());
			System.out.println("IFSC Code: " + b.getIfsc());
			System.out.println("Account Balance: " + b.getBal());
		}
	}
}
