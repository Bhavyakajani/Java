import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    private int choice, r, rounds;
    private int cnt_p=0, cnt_c=0;
    Scanner sc=new Scanner(System.in);
    public void setCounterPlayer()
    {
        cnt_p++;
    }
    public int getCounterPlayer()
    {
        return cnt_p;
    }

    public void setCounterComputer()
    {
        cnt_c++;
    }
    public int getCounterComputer()
    {
        return cnt_c;
    }
    public int userInput()
    {

        try {

            System.out.println("Enter your choice :\n");
            choice=sc.nextInt();
            return choice;
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input !! \nEnter an Integer\n");
            sc.next();
            userInput();
        }
        return choice;
    }
    public int randomInput()
    {
        Random rand=new Random();
        r=rand.nextInt(3);
        return r;
    }
    public void assign(int a)
    {
        switch(a)
        {
            case 1 : System.out.println("- Rock -");break;
            case 2 : System.out.println("- Paper -");break;
            case 3 : System.out.println("- Scissor -");break;
        }
    }
    /*
   computerinput 0-rock 1-paper 2-scissor
   playerInput 1-rock 2-paper 3-scissor
    */

    public void Logic(int playerInput, int computerinput)
    {

        while(playerInput>3 || playerInput<1)
        {
            System.out.println("Number out of range ! \nEnter number in range(1-3)!!");
            playerInput=userInput();
        }
        assign(playerInput);
        assign(computerinput+1);
        if((playerInput==1 && computerinput==2) ||(playerInput==2 && computerinput==0) || (playerInput==3 && computerinput==1))
        {
            setCounterPlayer();
            System.out.println("Congratulations!! You win");
        }
        else if((playerInput==3 && computerinput==0) ||(playerInput==2 && computerinput==2) || (playerInput==1 && computerinput==1))
        {
            setCounterComputer();
            System.out.println("AI wins");
        }
        else{
            System.out.println("Its a Draw");
        }
    }
    public void result()
    {
        int scorePlayer=getCounterPlayer();
        int scoreComputer=getCounterComputer();
        if(scoreComputer>scorePlayer)
        {
            System.out.println("Computer is the winner");
        }
        else if(scorePlayer>scoreComputer)
        {
            System.out.println("You are the winner");
        }
        else
        {
            System.out.println("It's a draw");
        }
    }

    public int number_of_rounds()
    {
        try
        {
            System.out.println("\nEnter the number of rounds you want to play");
            rounds=sc.nextInt();
            return rounds;
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input !! \nEnter an Integer\n");
            sc.next();
            randomInput();
        }

        return rounds;
    }
}
