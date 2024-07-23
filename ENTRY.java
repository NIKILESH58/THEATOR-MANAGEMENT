import java.util.Scanner;
public class ENTRY
{
    static int counter=0,NOOFTHEATRE=0,NOOFTHEATRETOADD=0,NOOFSCREENTOADD=0,j=0;
    static int USERCOUNTER=0,BOOKEDTHEATRENUMBER=0,BOOKEDSCREENNUMBER=0,TICKETPRICE=60;
    ENTRY obj = new ENTRY();
    static int NOOFSCREENS[]=new int[1000];
    static String NAME[]=new String[1000];
    static String PASSWORD[]=new String[1000];
    static String THEATRENAME[]=new String[1000];
    static String SCREENNAME[][]=new String[1000][1000];
    static String MOVIENAME[][]=new String[1000][1000];
    static int NUMBEROFROWS[][]=new int[1000][1000];
    static int NUMBEROFCOLUMNS[][]=new int[1000][1000];
    static String USERNAME[]=new String[1000];
    static int ALREADYBOOKED[][]=new int[1000][1000];
    static int AVAILABETICKETS[][]=new int[1000][1000];
    static int NOWAVAILABETICKETS[][]=new int[1000][1000];
    static int BOOKEDTHEATRE[]=new int[1000];
    static int BOOKEDSCREEN[]=new int[1000];
    static int BOOKEDBYUSER[]=new int[1000];
    public static void main(String[] args)  
   {
      String choiceforENTRY="";
      do
      {
          Scanner in = new Scanner(System.in); 
          System.out.println("WELCOME TO OUR THEATRE");
          System.out.println("ENTER YOUR DIGNITY");
          System.out.println("1-->NEW ADMIN");
          System.out.println("2-->ADMIN");
          System.out.println("3-->USER");
          System.out.println("0-->EXIT");
         choiceforENTRY=in.next();
         in.nextLine();
         switch(choiceforENTRY)
         {
             case "1":
             {
             newadmin(in);
             break;
            }
             case "2":
            {
             admin(in);
             break;
            }
             case "3":
                 {
             USER(in);
             break;
            }
             case "0":
            {
             System.out.println("EXIT");
             break;
            }
             default:
            {
             System.out.println("INVALID CHOICE");
             break;
            }
         }
      }while(!choiceforENTRY.equals("0"));
    }
     private static void newadmin(Scanner in)
   {
    System.out.println("WELCOME NEW ADMIN REGISTRATION");
      System.out.println("ENTER YOUR NAME");
      NAME[counter]=in.next();
      System.out.println("PASSWORD");
      PASSWORD[counter]=in.next();
      counter=counter+1;
   }
   private static void admin(Scanner in)
   {
      System.out.println("ENTER YOUR NAME");
      String NAMEcheck=in.next();
      System.out.println("PASSWORD");
      String PASSWORDcheck=in.next();
      in.nextLine();
      for(int i=0;i<=counter;i++)
      {
          if(NAMEcheck.equals(NAME[i])&&PASSWORDcheck.equals(PASSWORD[i]))
          {
              adminentry(in,i);
              break;
          }
          else
          {
            System.out.println("WRONG PASSWORD OR USER NAME PLEASE TRY AGAIN"); 
          }
      }
   }
   private static void adminentry(Scanner in,int j)
   {
      String choiceforWORK="";
      do
      {
          System.out.println("WELCOME ADMIN");
          System.out.println("ENTER YOUR WORK");
          if(NOOFTHEATRE==0)
          System.out.println("1-->ENTER NEW THEATRE");
          System.out.println("2-->ADD THEATRE");
          System.out.println("3-->ADD SCREEN");
          System.out.println("0-->EXIT");
         choiceforWORK=in.next();
         in.nextLine();
         switch(choiceforWORK)
         {
             case "1":
             {
             NEWTHEATRE(in,j);
             break;
            }
             case "2":
                 {
             ADDTHEATRE(in,j);
             break;
            }
             case "3":
                 {
             ADDSCREEN(in,j);
             break;
            }
             case "0":
            {
             System.out.println("EXIT");
             break;
            }
             default:
            {
             System.out.println("INVALID CHOICE");
             break;
            }
         }
      }while(!choiceforWORK.equals("0"));
   }
   private static void NEWTHEATRE(Scanner in,int k)
   {
      System.out.println("NEW THEATRE ENTRY PORTAL");
      System.out.println("ENTERed ADMIN PORTAL USING"+NAME[k]+"ADMIN ID");
      System.out.println("ENTER NUMBER OF THEATRE");
      NOOFTHEATRE=in.nextInt();
      in.nextLine();
      for(int i=1;i<=NOOFTHEATRE;i++)
      {
          System.out.println("THEATRE NAME");
          THEATRENAME[i]=in.nextLine();
          System.out.println("NUMBER OF SCREENS");
          NOOFSCREENS[i]=in.nextInt();
          in.nextLine();
          for(j=1;j<=NOOFSCREENS[i];j++)
          {
            System.out.println("SCREEN NAME");
            SCREENNAME[i][j]=in.nextLine();
            System.out.println("MOVIE NAME");
            MOVIENAME[i][j]=in.nextLine();
            System.out.println("NUMBER OF ROWS");
            NUMBEROFROWS[i][j]=in.nextInt();
            System.out.println("NUMBER OF COLUMNS");
            NUMBEROFCOLUMNS[i][j]=in.nextInt();in.nextLine();
          }
      }
   }
   private static void ADDTHEATRE(Scanner in,int k)
   {
      System.out.println("ADD THEATRE PORTAL");
      System.out.println("ALREADY PRESENT THEATRE");
      for(int j=1;j<=NOOFTHEATRE;j++)
      {
          System.out.println("THEATRE-->"+j+"<--THEATRE NAME"+THEATRENAME[j]);
      }
      System.out.println("ENTERed ADMIN PORTAL USING--->"+NAME[k]+"<----ADMIN ID");
      System.out.println("TOTAL ALREADY PRESENT THEATRE--->"+NOOFTHEATRE);
      System.out.println("ENTER NUMBER OF THEATRE TO ADD");
      int copy=NOOFTHEATRE;
      NOOFTHEATRETOADD=in.nextInt();
      in.nextLine();
      NOOFTHEATRE=NOOFTHEATRE+NOOFTHEATRETOADD;
      for(int i=copy+1;i<=NOOFTHEATRE;i++)
      {
          System.out.println("THEATRE NAME");
          THEATRENAME[i]=in.nextLine();
          System.out.println("NUMBER OF SCREENS");
          NOOFSCREENS[i]=in.nextInt();
          in.nextLine();
          for(j=1;j<=NOOFSCREENS[i];j++)
          {
            System.out.println("SCREEN NAME");
            SCREENNAME[i][j]=in.nextLine();
            System.out.println("MOVIE NAME");
            MOVIENAME[i][j]=in.nextLine();
            System.out.println("NUMBER OF ROWS");
            NUMBEROFROWS[i][j]=in.nextInt();
            System.out.println("NUMBER OF COLUMNS");
            NUMBEROFCOLUMNS[i][j]=in.nextInt();
            in.nextLine();
          }
      }
   }
   private static void ADDSCREEN(Scanner in,int k)
   {
      System.out.println("ADD SCREEN PORTAL");
      System.out.println("ENTERed ADMIN PORTAL USING--->"+NAME[k]+"<----ADMIN ID");
      System.out.println("ALREADY PRESENT THEATRE--->"+NOOFTHEATRE);
      for(int j=1;j<=NOOFTHEATRE;j++)
      {
          System.out.println("THEATRE-->"+j+"<--THEATRE NAME"+THEATRENAME[j]);
      }
      System.out.println("SELECT THEATRE TO ADD SCREEN");
      int select=in.nextInt();
      in.nextLine();
      System.out.println("ALREADY PRESENT SCREENS IN YOUR SELECTED THEATRE-->"+NOOFSCREENS[select]);
      for(j=1;j<=NOOFSCREENS[select];j++)
        {
         System.out.println("SCREEN NAME-->"+SCREENNAME[select][j]+"SCREEN NUMBER-->"+j+"MOVIE NAME IN SCREEN"+MOVIENAME[select][j]);  
        }
      System.out.println("ENTER NUMBER OF SCREENS TO ADD IN THEATRE-->"+THEATRENAME[select]);
      NOOFSCREENTOADD=in.nextInt();
      in.nextLine();
          int copy=NOOFSCREENS[select];
          NOOFSCREENS[select]=NOOFSCREENS[select]+NOOFSCREENTOADD;
          for(j=copy+1;j<=NOOFSCREENS[select];j++)
          {
            System.out.println("SCREEN NAME");
            SCREENNAME[select][j]=in.nextLine();
            System.out.println("MOVIE NAME");
            MOVIENAME[select][j]=in.nextLine();
            System.out.println("NUMBER OF ROWS");
            NUMBEROFROWS[select][j]=in.nextInt();
            System.out.println("NUMBER OF COLUMNS");
            NUMBEROFCOLUMNS[select][j]=in.nextInt();
            in.nextLine();
          }
   }
   private static void USER(Scanner in)
   {
      String choiceforbooking="";
      do
      {
          System.out.println("WELCOME USER");
          System.out.println("BOOK TICKET");
          System.out.println("VERIFY TICKET");
          System.out.println("EXIT");
         choiceforbooking=in.next();
         in.nextLine();
         switch(choiceforbooking)
         {
             case "1":
             {
             BOOKTICKET(in);
             break;
            } 
             case "2":
                 {
             VERIFYTICKET(in);
             break;
            }
             case "0":
            {
             System.out.println("EXIT");
             break;
            }
             default:
            {
             System.out.println("INVALID CHOICE");
             break;
            }
         }
      }while(!choiceforbooking.equals("0"));
   }
   private static void BOOKTICKET(Scanner in)
   {
       USERCOUNTER+=1;
       System.out.println("ENTER YOUR NAME");
       USERNAME[USERCOUNTER]=in.next();in.nextLine();
       System.out.println("YOUR USER ID---->"+USERCOUNTER);
       System.out.println("THEATRE LIST");
       for(int i=1;i<=NOOFTHEATRE;i++)
       {
         System.out.println("THEATRE-->"+i+"-->"+THEATRENAME[i]);
        }
       System.out.println("SELECT THEATRE NUMBER FOR BOOKING");
       BOOKEDTHEATRENUMBER=in.nextInt();in.nextLine();
       System.out.println("SELECTED THEATRE-->"+THEATRENAME[BOOKEDTHEATRENUMBER]);
       System.out.println("TOTAL SCREEN-->"+NOOFSCREENS[BOOKEDTHEATRENUMBER]);
        for(int j=1;j<=NOOFSCREENS[BOOKEDTHEATRENUMBER];j++)
       {
          System.out.println("SCREEN NAME--->"+SCREENNAME[BOOKEDTHEATRENUMBER][j]);
          System.out.println("MOVIE NAME--->"+MOVIENAME[BOOKEDTHEATRENUMBER][j]);
        }
       System.out.println("SELECT SCREEN NUMBER");
       BOOKEDSCREENNUMBER=in.nextInt();in.nextLine();
       ticketcounter(in,BOOKEDTHEATRENUMBER,BOOKEDSCREENNUMBER);
   }
    private static void VERIFYTICKET(Scanner in)
   {
        System.out.println("ENTER YOUR USER ID");
        int userId = in.nextInt();in.nextLine();
        if (userId <= USERCOUNTER && BOOKEDTHEATRE[userId] != 0) {
            int theatreNumber = BOOKEDTHEATRE[userId];
            int screenNumber = BOOKEDSCREEN[userId];
            int ticketCount = BOOKEDBYUSER[userId];
            System.out.println("THEATRE: " + THEATRENAME[theatreNumber]);
            System.out.println("SCREEN: " + SCREENNAME[theatreNumber][screenNumber]);
            System.out.println("MOVIE: " + MOVIENAME[theatreNumber][screenNumber]);
            System.out.println("NUMBER OF TICKETS: " + ticketCount);
        } else {
            System.out.println("INVALID USER ID OR NO TICKETS BOOKED");
        }
   }
   private static void ticketcounter(Scanner in,int THEATRENUMBER,int SCREENNUMBER)
   {
    int USERTICKET=0;
    System.out.println("AVAILABE TICKETS");
    AVAILABETICKETS[THEATRENUMBER][SCREENNUMBER]=NUMBEROFROWS[THEATRENUMBER][SCREENNUMBER]*NUMBEROFCOLUMNS[THEATRENUMBER][SCREENNUMBER];
    System.out.println(AVAILABETICKETS[THEATRENUMBER][SCREENNUMBER]);
    System.out.println("NOW AVAILABLE TICKETS");
    NOWAVAILABETICKETS[THEATRENUMBER][SCREENNUMBER]=AVAILABETICKETS[THEATRENUMBER][SCREENNUMBER]-ALREADYBOOKED[THEATRENUMBER][SCREENNUMBER];
    System.out.println(NOWAVAILABETICKETS[THEATRENUMBER][SCREENNUMBER]);
    if(NOWAVAILABETICKETS[THEATRENUMBER][SCREENNUMBER]>0)
    {
      System.out.println("HOW MANY TICKET DO YOU WANT");
      USERTICKET=in.nextInt();in.nextLine();
      if(USERTICKET<NOWAVAILABETICKETS[THEATRENUMBER][SCREENNUMBER])
      {
          ALREADYBOOKED[THEATRENUMBER][SCREENNUMBER]+=USERTICKET;
          BOOKEDTHEATRE[USERCOUNTER] = THEATRENUMBER;
          BOOKEDSCREEN[USERCOUNTER] = SCREENNUMBER;
          BOOKEDBYUSER[USERCOUNTER] = USERTICKET;
          payment(in,USERTICKET);
      }
      else
      {
      System.out.println("AVAILABLE SEATS ARE LOW");
      }
    }
    else
    {
      System.out.println("TRY ANY OTHER SCREEN");
    }
   }
   private static void payment(Scanner in,int USERTICKET)
   {
        int totalAmount = USERTICKET * TICKETPRICE;
        System.out.println("TOTAL AMOUNT: " + totalAmount);
        System.out.println("DO YOU WANT TO PROCEED WITH PAYMENT? (yes/no)");
        String confirm = in.next();
        in.nextLine();
        if (confirm.equalsIgnoreCase("yes")) 
        {
            System.out.println("PAYMENT SUCCESSFUL");
            System.out.println("TICKETS BOOKED SUCCESSFULLY");
        }
        else 
        {
            System.out.println("PAYMENT CANCELLED");
            ALREADYBOOKED[BOOKEDTHEATRENUMBER][BOOKEDSCREENNUMBER] -= USERTICKET;
            BOOKEDTHEATRE[USERCOUNTER] = 0;
            BOOKEDSCREEN[USERCOUNTER] = 0;
            BOOKEDBYUSER[USERCOUNTER] = 0;
            USERCOUNTER-=1;
        }
   }
}


