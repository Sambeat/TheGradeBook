/**
 * Created by M on 2014-10-09.
 */
public class GradeBookTest
{
    public static void main( String[] args)
    {
        // create GradeBook object myGradeBook and
        // pass course name to constructor
        GradeBook myGradeBook = new GradeBook( "CS101 Intro to JProg" );

        myGradeBook.displayMessage(); // display welcome message
        myGradeBook.determineClassAverage(); // find average of 10 grades
    } // end main
} // end class GradeBookTest