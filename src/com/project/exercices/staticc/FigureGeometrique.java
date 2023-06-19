package com.project.exercices.staticc;

public class FigureGeometrique {

	String couleurContour = "Jaune";
	String couleurSurface = "Blanc";

	static int nbFigures = 0;
	static int nbFigContNoir = 0;
	static int nbFigSurfBlanc = 0;
	
	

	FigureGeometrique() {
	}
	
	
	

	FigureGeometrique(String coulSurf, String coulCont) {
		couleurSurface = coulSurf;
		couleurContour = coulCont;
		
		if (couleurContour.equals("Noir")) {
			nbFigContNoir++;
		}
		
		if (couleurSurface.equals("Blanc")) {
			nbFigSurfBlanc++;
		}
		
		nbFigures++;
		
	} // End constructeur 

	
	
	void changerCouleurContour(String couleur) {
		couleurContour = couleur;
	}

	void changerCouleurSurface(String couleur) {
		couleurSurface = couleur;
	}

}
