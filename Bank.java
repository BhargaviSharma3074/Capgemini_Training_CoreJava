class Bank
{
    private int accNum;
    private String name;
    private int ifsc;
    private int bal;

    // Constructor
    public Bank(int accNum, String name, int ifsc, int bal)
    {
        this.accNum = accNum;
        this.name = name;
        this.ifsc = ifsc;
        this.bal = bal;
    }

    // Getters
    public int getAccNum()
    {
        return accNum;
    }

    public String getName()
    {
        return name;
    }

    public int getIfsc()
    {
        return ifsc;
    }

    public int getBal()
    {
        return bal;
    }

    // Setters with account verification
    public void setName(String newName, int checkAcc)
    {
        if(checkAcc == accNum)
        {
            this.name = newName;
        }
        else
        {
            System.out.println("Invalid Account Number. Name not updated.");
        }
    }

    public void setBal(int newBal, int checkAcc)
    {
        if(checkAcc == accNum)
        {
            this.bal = newBal;
        }
        else
        {
            System.out.println("Invalid Account Number. Balance not updated.");
        }
    }
}
