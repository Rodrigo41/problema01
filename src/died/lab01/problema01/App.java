package died.lab01.problema01;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Punto p1 = new Punto(1,1);
Punto p2 = new Punto(2,2);

Recta R= new Recta(p1,p2);

System.out.printf("Pendiente recta: %s%n", R.pendiente());

Punto p3= new Punto(3,3);

Recta R2= new Recta(p2,p3);

System.out.printf("R y R2 son iguales?: %s", R.equals(R2));
	}

}
