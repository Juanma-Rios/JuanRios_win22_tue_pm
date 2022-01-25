package student;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class partTimeStudent extends Student
{
   private int numCourses;

   public partTimeStudent (String studentId, String studentName, int numCourses)
   {
      super(studentId, studentName);
      this.numCourses = numCourses;
   }

   public int getNumCourses ()
   {
      return numCourses;
   }

   public void setNumCourses (int numCourses)
   {
      this.numCourses = numCourses;
   }

}
