package mainPackage;

import othersPackage.Operator;
import othersPackage.TestFile;

public class MainClass 
{

	public static void main(String[] args) 
	{
		TestFile f = new TestFile();
		Operator op = new Operator ();
		op.setAccounts(f.readFromFile());
		op.Menu();
		f.writeToFile(op.getAccounts());
		
	}

}
