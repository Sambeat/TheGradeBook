import java.util.Scanner;

/**
 * Created by M on 2014-10-09.
 */
//more comments! EVEN MORE
public class GradeBook {
    private String courseName; //Name of course this GradeBook represents

    private int total;
    private int gradeCounter;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;

    // constructor initializes courseName
    public GradeBook( String name)
    {
        courseName = name; // initializes courseName
    } // end constructor

    // method to set the course name

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // display a welcome message to the GradeBook user
    public void displayMessage()
    {
        //getCourseName gets the name of the course
        System.out.printf("Welcome to the grade book for\n%s!\n\n", getCourseName());
    } // end method displayMessage

    public void inputGrades()
    {
        Scanner input = new Scanner( System.in );

        int grade; // grade entered by user

        System.out.printf( "%s\n%s\n  %s\n  %s\n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        // loop until user enters the end-of-file indicator
        while ( input.hasNext() )
        {
            grade = input.nextInt(); // read grade
            total += grade; // add grade to total
            ++gradeCounter; // increment number of grades

            // call method to increment appropriate counter
            incrementLetterGradeCounter( grade );
        } // end while
    } // end method inputGrades

    // add 1 to appropriate counter for specified grade
    private void incrementLetterGradeCounter( int grade )
    {
        //determine grade
        switch ( grade / 10 )
        {
            case 9:  // grade was between 90
            case 10: // and 100, inclusive
                ++aCount; // increment aCount
                break; // exit switch

            case 8: // between 80-89
                ++bCount; // increment bCount
                break; // exit switch

            case 7: // between 70-79
                ++cCount; // increment cCount
                break;

            case 6: // between 60-69
                ++dCount;
                break;

            default: // less than 60
                ++fCount;
                break;
        } // end switch
    } // end method incrementLetterGradeCounter

    public void displayGradeReport()
    {
        System.out.println( "\nGrade Report:");

        //if user entered at least one grade...
        if (gradeCounter != 0 )
        {
            // calculate average of all grades entered
            double average = (double) total / gradeCounter;

            // output summary of results
            System.out.printf( "Total of the %d grades entered is %d\n", gradeCounter, total );
            System.out.printf( "Class average is %.2f\n", average );
            System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                    "Number of students who received each grade:",
                    "A: ", aCount, //display A..
                    "B: ", bCount, // B
                    "C: ", cCount, // C
                    "D: ", dCount, // D
                    "F: ", fCount ); // F
        } // end if
        else //no grades entered
            System.out.println( "No grades were entered" );
    } // end method displayGradeReport
} // end class GradeBook