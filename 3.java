public class program3 {

	public static void main(String[] args)  {
		
		String email="aenugula.karthik@gmail.com";
		String[] names=email.split("@");
		if(names[0].contains(".")) {
			String[] finalname=names[0].split(".");
			String firstName=finalname[0];
			String lastName=finalname[1];
		}
		if(names[0].contains("_")) {
			String[] finalname=names[0].split("_");
			String firstName=finalname[0];
			String lastName=finalname[1];
		}
		if(names[0].contains("(1)")) {
			String[] finalname=names[0].split("(1)");
			String firstName=finalname[0];
			String lastName=finalname[1];
		}
	}
}
