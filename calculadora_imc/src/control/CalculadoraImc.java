package control;

public class CalculadoraImc {

	    
	    public String CalcularImc(double altura, double peso, int idade, String sexo){
	        double imc;
	        imc = peso/(altura*altura);

	        if (idade>19 && idade<65){
	            if ( imc< 16){
	                return "Baixo peso muito grave";
	            }
	            if (imc>= 16 && imc<17){
	                return "Baixo peso grave";
	            }
	            if (imc>= 17 && imc<18.5){
	                return "Baixo peso";
	            }
	            if (imc>= 18.5 && imc<25){
	                return "Peso normal";
	            }
	            if (imc>= 25 && imc<30){
	                return "Sobrepeso";
	            }
	            if (imc>= 30 && imc< 35){
	                return "Obesidade grau I";
	            }
	            if (imc>= 35 && imc<40){
	                return "Obesidade grau II";
	            }
	            if (imc>= 40){
	                return "Obesidade grau III";
	            }

	        if (idade>65){
	            if (sexo.toLowerCase() == "masculino"){
	                if (imc<22){
	                    return "Baixo peso";
	                }
	                if (imc>= 22 && imc<=27){
	                    return "Peso normal";
	                }
	                if (imc> 27 && imc<= 30){
	                    return "Sobrepeso";
	                }
	                if (imc> 30 && imc<= 35){
	                    return "Obesidade grau I";
	                }
	                if (imc> 35 && imc<40 ){
	                    return "Obesidade grau II";
	                }
	                if (imc>= 40){
	                    return "Obesidade grau III";
	                }
	            if (sexo.toLowerCase() == "feminino"){
	                if (imc<22){
	                    return "Baixo peso";
	                }
	                if (imc>= 22 && imc<=27){
	                    return "Peso normal";
	                }
	                if (imc> 27 && imc<= 32){
	                    return "Sobrepeso";
	                }
	                if (imc> 32 && imc<= 37){
	                    return "Obesidade grau I";
	                }
	                if (imc> 37 && imc<42 ){
	                    return "Obesidade grau II";
	                }
	                if (imc>= 42){
	                    return "Obesidade grau III";
	                }

	            }
	        }
	        }
	        }
	        return "erro";
	        }
	    }

