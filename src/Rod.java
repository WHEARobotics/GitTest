
public class Rod {
	double diameter;
	double length;
	double volume;
	
	Rod(double d, double len){
		diameter = d;
		length = len;
		double volume = 3.14 * d * d / 4 * len;
	}

}
