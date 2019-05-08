package Schach;

public class Figur extends Feld {

	//Aufgaben
	
	
	/* (+) boolean: farbeWeiss
	 * (+) boolean: bewegt
	 * -------------------------
	 * (+) boolean: spielZug(sp:Spilfeld,  von:Position  ,   nach:Position)
	 * (+) boolean: spielzugMoeglich(sp: SpielFeld, von:Position , nach:Position)
	 * 
	 */
	
	public boolean farbeWeiss()
	{
		return false;
	}
	
	public boolean bewegt()
	{
		return false;
	}
	
	public boolean spielZug(SpielFeld sp , Position von , Position nach)
	{
		return false;
	}
	
	public boolean spielzugMoeglich(SpielFeld sp, Position von , Position nach)
	{
		return false;
	}
}
