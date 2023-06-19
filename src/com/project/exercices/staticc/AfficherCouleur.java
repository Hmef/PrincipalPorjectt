package com.project.exercices.staticc;

public class AfficherCouleur {

	public static void main(String[] args) {
		
		
		FigureGeometrique f1, f2, f3, f4;
		
		
		f1 = new FigureGeometrique("Rouge", "Noir");
		f2 = new FigureGeometrique("Bleu", "Blanc");
		f3 = new FigureGeometrique();
		f4 = new FigureGeometrique("Violet", "Orange");

		f2.changerCouleurContour("Noir");

		System.out.println(f3.couleurSurface);
		System.out.println(f3.couleurContour);

		System.out.println(f2.couleurContour);

		System.out.println(FigureGeometrique.nbFigures);  // chaque appel du constructeur ( avec paramétres ), 
														  //3 appels = incrémentation nbFigures 3 fois  
		
		System.out.println(f2.nbFigures);  //??  nbFigures est static donc il appartient à lui meme et non à ne instance 

		System.out.println(f1.nbFigContNoir);
		System.out.println(f4.nbFigSurfBlanc);
	}

}
