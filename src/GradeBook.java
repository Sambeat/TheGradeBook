import java.util.Scanner;

/**
 * Created by M on 2014-10-09.
 */
//more comments! EVEN MORE
public class GradeBook {
    private String courseName; //Name of course this GradeBook represents

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

    // determine class average based on 10 grades entered by user
    public void determineClassAverage(){
        // create Scanner to obtain input from command window
        Scanner input = new Scanner( System.in );

        int total; // sum of grades entered by user
        int gradeCounter; // number of the grade to be entered next
        int grade; // grade value entered by user
        double average; // average of grades with decimal point

        //initialization phase
        total = 0; // initialize total
        gradeCounter = 0; // initialize loop counter

        // processing phase
        System.out.print( "Enter grade or -1 to quit: " );
        grade = input.nextInt();
        // loop until sentinel value is read
        while ( grade != -1)
        {
            total += grade; // add grade to total
            gradeCounter ++; // increment counter

            // prompt for input again
            System.out.print( "Enter grade or -1 to quit: ");
            grade = input.nextInt();
        } // end while

        // termination phase
        if (gradeCounter != 0 )
        {
            // calc avg of grades
            average = (double) total / gradeCounter;

            // display
            System.out.printf( "\nTotal of the %d grades entered is %d\n", gradeCounter, total);
            System.out.printf( "Class average is %.2f\n", average);
        } // end if
        else
            System.out.println( "No grades were entered" );

    } // end method determineClassAverage
} // end class GradeBook