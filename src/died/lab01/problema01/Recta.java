package died.lab01.problema01;

public class Recta {
private Punto punto1;
private Punto punto2;

public Recta(Punto punto1, Punto punto2) {
	super();
	this.punto1 = punto1;
	this.punto2 = punto2;
}
public Recta() {
super();
this.punto1= punto1.setX(1);
this.punto1= punto1.setY(1);
this.punto2= punto2.setX(1);
this.punto2= punto2.setY(1);
}
public float pendiente() {
	return (this.punto2.getY()-this.punto1.getY())/(this.punto2.getX()-this.punto1.getY());
	
}
public boolean paralelas(Recta R2) {
	if(this.pendiente()==R2.pendiente()) {
		return true;
	}
	return false;
}
public boolean equals(Recta R2) {
	Recta R3= new Recta(this.punto1,R2.punto1);
	if(this.pendiente()==R2.pendiente() && this.pendiente()==R3.pendiente()) {
		return true;
	}
	return false;
}

}
