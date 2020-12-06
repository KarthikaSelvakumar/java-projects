class Games
{       
       public static void main(String[] args)
       {           
           Games g1 = new Games();
           char play = 'Y';
           String game = "HandB";           
           while(play == 'Y')
           {
               switch(game)
               {
                     case "HandB":
                           g1.play();
                           break;
                     case "Chess":
                           g1.play();
                           break;
               }
               System.out.println("Do you want to play again? (Y/N): ");
               play = 'N';
           } 
       }
  public void play()
  {
         int points = 1500;
         boolean check = true;
         String game = "HandB";
         if(game == "HandB")
         {
          if(points >= 1000) 
	  	{
         	 System.out.println("You WIN the game");
     		}
            else
        	 {
        	 System.out.println("Try again to score more");
       	         }
 	}
        if(game == "Chess")
         {
           if(check == true)
             {
               System.out.println("Checkmate");
              }
           else
             {
               System.out.println("You lose");
             } 
	}
 }
}

  


    


   