package died.lab01.problema01;

public class Punto {
private float x;
private float y;

public Punto(float x,float y) {
	this.x=x;
	this.y=y;
}

public float getX() {
	return x;
}

public Punto setX(float x) {
	this.x = x;
	return null;
	
}

public float getY() {
	return y;
}

public Punto setY(float y) {
	this.y = y;
	return null;
	
}

public boolean equals(Object OtroPunto) {
	if(((Punto) OtroPunto).getX()==((Punto) OtroPunto).getY() && OtroPunto.getClass()==Punto.class) {
		return true;
	}
	return false;
}

}
