package puzzle;

public class Piece {
	private int[] cotesPiece; 			//valeurs sur les côtés (haut, droite, bas, gauche)
	private char pieceName;
	
	public Piece(char etiquette, int[] cotes) {
		this.cotesPiece = cotes;
		this.pieceName = etiquette;
	}
	
	public String toString() {					//affichage de la pièce
		String l1 = "+----------+\n";
		String l2, l3, l4;
		String l5 = "+----------+\n";
		
		if (cotesPiece[1] < 0) {						//côté haut
			l2 = "|    "+cotesPiece[1]+"    |\n";
		} else {
			l2 = "|     "+cotesPiece[1]+"    |\n";
		}
		
		if (cotesPiece[4] < 0) {							//côté gauche
			if (cotesPiece[2] < 0) {						//côté droit
				l3 = "|"+cotesPiece[4]+" ["+this.pieceName+"] "+cotesPiece[2]+"|\n";
			} else {
				l3 = "|"+cotesPiece[4]+" ["+this.pieceName+"]  "+cotesPiece[2]+"|\n";
			}
		} else {
			if (cotesPiece[2] < 0) {
				l3 = "| "+cotesPiece[4]+" ["+this.pieceName+"] "+cotesPiece[2]+"|\n";
			} else {
				l3 = "| "+cotesPiece[4]+" ["+this.pieceName+"]  "+cotesPiece[2]+"|\n";
			}
		}
		
		if (cotesPiece[3] < 0) {
			l4 = "|    "+cotesPiece[1]+"    |\n";
		} else {
			l4 = "|     "+cotesPiece[1]+"    |\n";
		}
		
		return (l1+l2+l3+l4+l5);
	}
	
	public void rotateRight() {					//rotation de 90 degrés de la pièce dans le sens horaire
		int temp = cotesPiece[cotesPiece.length-1];
		for (int i = 0; i < cotesPiece[cotesPiece.length]; i++) {
			cotesPiece[i+1] = cotesPiece[i];
		}
		cotesPiece[0] = temp;
	}
	
	public int[] absSort(int[] tab) {
		
	}
	
	public int[] sort(int[] tab) {
		
	}
	
	public boolean isPerfect(Piece p) {			//détermine si une piece est pafaite
		for (int i = 0; i < cotesPiece.length-1; i++) {
			if (absSort(cotesPiece)[i] != absSort(cotesPiece)[i+1]) {
				
			}
		}
	}
	
	
}
