package semestermarkaverager;

public class SemesterMarks {
public static double calculateAverage(double sem1,double sem2,double sem3,double sem4,double sem5,double sem6,double sem7,double sem8)
{
	double avg=(sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
	System.out.println("the average semester marks is"+avg);
	return avg;
}
}
