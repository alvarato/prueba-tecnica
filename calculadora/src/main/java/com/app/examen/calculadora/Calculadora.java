package com.app.examen.calculadora;

public class Calculadora {

	public String calculo(String key,int a,int b) {
			switch (key) {
			case "+": return suma(a,b);
			case "-": return resta(a,b);
			case "*": return multiplicacion(a,b);
			case "/": return division(a,b);
			default: return "SyntaxError";
		}


	}

		// suma a+b;
		public String suma(int a, int b) {
			try {
				return(""+(a+b));
			}catch(Exception ex) {
				System.out.println(ex);
				return("El dato ingresado no es valido");
			}
		}

		// resta a-b;
		public String resta(int a, int b) {
			try {
				return(""+(a-b));
			}catch(Exception ex) {
				System.out.println(ex);
				return("El dato ingresado no es valido");
			}
		}

		// multiplica a*b;
		public String multiplicacion(int a, int b) {
			try {
				return(""+(a*b));
			}catch(Exception ex) {
				System.out.println(ex);
				return("El dato ingresado no es valido");
			}

		}

		// divide a en b;
		public String division(int a, int b) {
			try {
				if (b == 0) {
					return "No se puede dividir en 0";
				}else {
					return(""+(a/b));
				}
			}catch (Exception ex) {
				System.out.println(ex);
				return("El dato ingresado no es valido");
			}

		}
}
