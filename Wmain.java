
import javax.swing.JOptionPane;

public class Wmain
{
	
	
	public static void main (String[] args) 
	{
  
		Wlist words = new Wlist();
		String searchword;

		words.add("hi");
		words.add("bye");
		words.add("xxx");
		JOptionPane.showMessageDialog(null,"List: " + words);
  
		searchword = JOptionPane.showInputDialog("enter a word to search for"    );
		if (words.isThere(searchword)) 
			{
				JOptionPane.showMessageDialog(null, "it's there");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"it's not there");
			}

  
		searchword = JOptionPane.showInputDialog("enter a word to search for"    );
		if (words.isThere(searchword)) 
		{
			JOptionPane.showMessageDialog(null, "it's there");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"it's not there");
		}

  
		searchword = JOptionPane.showInputDialog("enter a word to search for"    );
		if (words.isThere(searchword)) 
		{
			JOptionPane.showMessageDialog(null, "it's there");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"it's not there");
		}

  
  }
}