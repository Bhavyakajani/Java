class Main
{
    public static void main(String args[])
    {
        
        rock_paper_scissors player=new rock_paper_scissors();
        System.out.println("\n \tRock, Paper, Scissors\n");
        System.out.println("--------------------------------\n");
        System.out.println("Press : 1 for Rock, 2 for Paper, 3 for scissor\n");
        System.out.println("------------------------------------\n");
        
        int n=player.number_of_rounds();
        for(int i=0; i<n;i++)
        {
            System.out.println("------------------------------------");
            System.out.println("\n\tRound :- "+i);  
            int p=player.userInput();
            int r=player.randomInput();
           // System.out.println(r);
            player.Logic(p,r);
            
        }
        player.result();
        
        //System.out.println(player.randomInput());
        //System.out.println("Congratulations !!");
    }
}
