package calculadora;

public class Calculadora {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Por favor entregue 3 argumentos. Ejemplo 2 suma 3");
			return;
		}
		
		int numUno = Integer.parseInt(args[0]);
		int numDos = Integer.parseInt(args[2]);
		String operacion = args[1];
		int resultado = 0;
		
		switch (operacion) {
		case "sumar":
			resultado = sumar(numUno, numDos);
			break;
		case "restar":
			resultado = restar(numUno, numDos);
			break;
		case "multiplicar":
			resultado = multiplicar(numUno, numDos);
			break;

		default:
			break;
		}
		System.out.println("El resultado es " + resultado);
		
	}
	
	public static int sumar (int numeroUno, int numeroDos) {
		return numeroUno + numeroDos;
	}
	
	public static int restar (int numeroUno, int numeroDos) {
		return numeroUno - numeroDos;
	}
	
	public static int multiplicar (int numeroUno, int numeroDos) {
		return numeroUno * numeroDos;
	}

}
