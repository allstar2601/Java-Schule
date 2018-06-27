import java.io.*; // wird von der Eingabe benötigt
 
public class Spielfeld {
    //Eigenschaften
    private Kaestchen[][] feld;
    private static BufferedReader in; // Eingabe
 
    //Konstruktor
    public Spielfeld() {
        feld = new Kaestchen[3][3];
        for (int i=0;i<3;i++){// senkrecht
            for (int j=0;j<3;j++){// waagerecht
                feld[j][i]=new Kaestchen();
            }
        }
 
        // Vorbereitung für die Eingabe
        in = new BufferedReader(new InputStreamReader(System.in));
 
    }
 
    //Methoden
    public void setzeSpielstein(int x, int y, String stein){
        feld[x][y].setzeStein(stein);
    }
 
    public void gibSpielAus(){
        System.out.println("\n  012");
        for (int i=0;i<3;i++){
            System.out.print(i+" ");
            for (int j=0;j<3;j++){
                System.out.print(feld[j][i].getZeichen());
            }
            System.out.println(); // Zeilenumbruch nach 3 Kaestchen
        }
 
    }
 
    public void spieleEineRunde(){
        // unguenstig: Starre Anzahl von Zügen, immer 10 Züge
        int x,y;
        for (int i=1;i<5;i++){
            gibSpielAus();
            System.out.print("Spieler X bitte die x-Koordinate (0-2)");
            try {
            x=liesInt();
            }
             catch(IOException e) {
            x=-1;
            }
            System.out.print("Spieler X bitte die y-Koordinate (0-2)");
            try {
            y=liesInt();
            }
            catch(IOException e) {
            y=-1;
            }
            setzeSpielstein(x, y, "X");
            gibSpielAus();
            System.out.print("Spieler O bitte die x-Koordinate (0-2)");
            try {
            x=liesInt();
            }
             catch(IOException e) {
            x=-1;
            }
            System.out.print("Spieler O bitte die y-Koordinate (0-2)");
            try {
            y=liesInt();
            }
            catch(IOException e) {
            y=-1;
            }            
            setzeSpielstein(x, y, "O");
        }
    }
 
    // Methode für die Eingabe
    // Mehr hier: http://www.wifo.uni-mannheim.de/Java/oop/OOPinJava/kapitel11/StandardEingabe_java.html
    public int liesInt() throws IOException {
        try {
        return Integer.parseInt(in.readLine());
        }
        catch(IOException e) {
          return (-1);
        }
    }
}