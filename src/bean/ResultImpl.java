package bean;

public interface ResultImpl {
	// calculate total marks
	public double totalMarks(double... marks);

	// calculate average marks
	public double avgMarks(double... marks);

	// calculate total cgpa
	public double totalCgpa(double... cgpa);

	// calculate average cgpa
	public double avgCgpa(double... cgpa);

	// calculate cgpa from given mark
	public double calculateCgpa(double mark);

	// calculate grade from given cgpa
	public String calculateGrade(double cgpa);
}
