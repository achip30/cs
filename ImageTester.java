package project3;
import java.awt.Color;

import java.util.Scanner;


public class ImageTester {
	public static Scanner input = new Scanner( System.in );
	
	public static void main(String[] args) {
		
		ImageUtils utils = new ImageUtils();
		
		Color[][] origPic = utils.loadImage("src/LennaCV.png");
		utils.addImage(origPic, "Original PIcture");
		
		Color[][] vert = V(origPic);
		utils.addImage(vert, "Vertical Stripes");
		
		Color[][] horz = H(origPic);
		utils.addImage(horz, "Horizontal Stripes");
		
		utils.display();
		
		
	}
	public static Color[][] V(Color[][] img){
		Color[][] picture= ImageUtils.cloneArray(img);
		for( int i=0; i < picture.length; i++) {
		for( int j=0; j < picture[i].length; j++) {
			Color pixels = img[i][j];
		// first vert blue 
			if (i >= picture.length/4 && i <= picture.length/2) {
                Color pixel = picture[i][j];
                int b = pixel.getBlue();
                picture[i][j] = new Color(0,0,b); 
         }
		// second vert blue 
			if (i >= 3*picture.length/4) {
                Color pixel = picture[i][j];
                int b = pixel.getBlue();
                picture[i][j] = new Color(0,0,b); 
			}
		// first vert yellow 
        if (i <= picture.length/4) {
        	Color pixel = picture[i][j];
        	int g = pixel.getGreen();
        	int r = pixel.getRed(); 
        	picture[i][j] = new Color(r,g,0); 
        }
        // second vert yellow 
        if (i >= picture.length/2 && i <= 3*picture.length/4) {
        	Color pixel = picture[i][j];
        	int g = pixel.getGreen();
        	int r = pixel.getRed(); 
        	picture[i][j] = new Color(r,g,0);
        }	
			}
	}
		return picture;		
}
	public static Color[][] H(Color[][] img){
		Color[][] picture2= ImageUtils.cloneArray(img);
		for( int i=0; i < picture2.length; i++) {
		for( int j=0; j < picture2[i].length; j++) {
			Color pixels = img[i][j];
		// first horz blue
			if (j >= picture2.length/4 && j <= picture2.length/2) {
                Color pixel = picture2[i][j];
                int b = pixel.getBlue();
                picture2[i][j] = new Color(0,0,b); 
			}
		// second horz blue 
                if (j >= 3*picture2.length/4) {
                    Color pixel = picture2[i][j];
                    int b = pixel.getBlue();
                    picture2[i][j] = new Color(0,0,b); 
                }
		// first horz yellow 
                if (j <= picture2.length/4) {
                	Color pixel = picture2[i][j];
                	int g = pixel.getGreen();
                	int r = pixel.getRed(); 
                	picture2[i][j] = new Color(r,g,0); 
                }
		// second horz yellow 
                if (j >= picture2.length/2 && j <= 3*picture2.length/4) {
                	Color pixel = picture2[i][j];
                	int g = pixel.getGreen();
                	int r = pixel.getRed(); 
                	picture2[i][j] = new Color(r,g,0);
                }	
		}
		}
		
		return picture2;

	
	}
}
