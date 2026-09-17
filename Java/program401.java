import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class StudyLog
{
    private LocalDate Date;
    private String Subject;
    private double Duration;
    private String Description;

    public StudyLog(LocalDate a, String b, double c, String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Description = d;
    }

    @Override
    public String toString()
    {
        return Date + " | " + Subject + " | " + Duration + " | " + Description;
    }

    public LocalDate getDate()
    {
        return this.Date;
    }

    public String getSubject()
    {
        return this.Subject;
    }

    public double getDuration()
    {
        return this.Duration;
    }

    public String getDescription()
    {
        return this.Description;
    }
}

class StudyTracker
{
    public ArrayList<StudyLog> Database;

    public StudyTracker()
    {
        Database = new ArrayList<StudyLog>();
    }

    public void InsertLog()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("-------------------------------------------------------");
        System.out.println("-----------Enter the Details of Yours Study------------");
        System.out.println("-------------------------------------------------------");

        LocalDate lobj = LocalDate.now();

        System.out.println("We are Entering the Data as : "+lobj);
        System.out.println("Entered the Name of Subject like C / C++ / Java :");
        String sub = sobj.nextLine();

        System.out.println("Enter the Time Period of Yours Study: ");
        Double dur = sobj.nextDouble();

        // Issue
        System.out.println("Please Provide the Description of Yours Study: ");
        String desc = sobj.nextLine();

        StudyLog studyobj = new StudyLog(lobj, sub , dur, desc);

        Database.add(studyobj);
        System.out.println("Study log gets Inserted Successfully!!!!!!!");

        System.out.println("-------------------------------------------------------");

    }

    public void DisplayLog()
    {}

    public void ExportToCSV()
    {}

    public void SummaryByDate()
    {}

    public void SummaryBySubject()
    {}

}

class program401
{
    public static void main(String A[]) throws Exception
    {
        int iChoice = 0;

        StudyTracker stobj = new StudyTracker();
        Scanner sobj = new Scanner(System.in);

        System.out.println("-------------------------------------------------------");  
        System.out.println("----------Welcome to Marvellous Study Tracker----------");
        System.out.println("-------------------------------------------------------"); 

        
        do
        {
            System.out.println("-------------------------------------------------------");
            System.out.println("Please Select appropriate option");
            System.out.println("1   : Insert new StudyLog");
            System.out.println("2   : View all Study Log");
            System.out.println("3   : Export Study Log to CSV");
            System.out.println("4   : Summary of Study Log by Date");
            System.out.println("5   : Summary of Study Log by Subject");
            System.out.println("6   : Exit the Application");
            System.out.println("-------------------------------------------------------");

            iChoice = sobj.nextInt();
            
            switch(iChoice)
            {   
                // Insert New Log
                case 1:
                    stobj.InsertLog();
                    break;
                
                // View all Study Log
                case 2:
                    stobj.DisplayLog();
                    break;

                // Export Study Log to CSV
                case 3:
                    stobj.ExportToCSV();
                    break;

                // Summary of Study Log by Date
                case 4:
                    stobj.SummaryByDate();
                    break;

                // Summary of Study Log by Subject
                case 5:
                    stobj.SummaryBySubject();
                    break;

                // Exit the Application
                case 6:
                    break;

                default:
                    System.out.println("Please Enter the Valid Option");
                    break;
            }

        }while(iChoice != 6);

        System.out.println("-------------------------------------------------------");  
        System.out.println("----------Thank you For using Study Tracker------------");
        System.out.println("-------------------------------------------------------");
        
    }// End of Main
}    // Enc of Class
