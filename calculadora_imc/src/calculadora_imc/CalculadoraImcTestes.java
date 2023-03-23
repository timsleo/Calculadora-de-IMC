package calculadora_imc;

import control.CalculadoraImc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraImcTestes {

	CalculadoraImc calc;
	
	@Before
	public void setup() {
		
		calc = new CalculadoraImc();
	}
	
	@Test
	public void testeAdultoBaixoPesoMuitoGraveLimiteSuperior() {
		Assert.assertEquals("Baixo peso muito grave", calc.CalcularImc(1.80, 51.5, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoBaixoPesoGraveLimiteInferior() {
		Assert.assertEquals("Baixo peso grave", calc.CalcularImc(1.75, 52, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoBaixoPesoGraveLimiteSuperior() {
		Assert.assertEquals("Baixo peso grave", calc.CalcularImc(1.80, 55, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoBaixoPesoLimiteInferior() {
		Assert.assertEquals("Baixo peso", calc.CalcularImc(1.80, 56, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoBaixoPesoLimiteSuperior() {
		Assert.assertEquals("Baixo peso", calc.CalcularImc(1.80, 59, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoPesoNormalLimiteInferior() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(1.80, 60, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoPesoNormalLimiteSuperior() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(1.80, 80, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoSobrepesoLimiteInferior() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(1.80, 81, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoSobrepesoLimiteSuperior() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(1.80, 97, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoObesidadeGrauILimiteInferior() {
		Assert.assertEquals("Obesidade grau I", calc.CalcularImc(1.80, 98, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoObesidadeGrauILimiteSuperior() {
		Assert.assertEquals("Obesidade grau I", calc.CalcularImc(1.80, 113, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoObesidadeGrauIILimiteInferior() {
		Assert.assertEquals("Obesidade grau II", calc.CalcularImc(1.80, 114, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoObesidadeGrauIILimiteSuperior() {
		Assert.assertEquals("Obesidade grau II", calc.CalcularImc(1.80, 129, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoObesidadeGrauIIILimiteInferior() {
		Assert.assertEquals("Obesidade grau III", calc.CalcularImc(1.80, 130, 20, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoBaixoPesoLimiteSuperior() {
		Assert.assertEquals("Baixo peso", calc.CalcularImc(1.80, 70, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoPesoNormalLimiteInferior() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(1.80, 71, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoPesoNormalLimiteSuperior() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(1.80, 87, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoSobrepesoLimiteInferior() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(1.80, 88, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoSobrepesoLimiteSuperior() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(1.80, 96, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoObesidadeGrauILimiteInferior() {
		Assert.assertEquals("Obesidade grau I", calc.CalcularImc(1.80, 97, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoObesidadeGrauILimiteSuperior() {
		Assert.assertEquals("Obesidade grau I", calc.CalcularImc(1.80, 113, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoObesidadeGrauIILimiteInferior() {
		Assert.assertEquals("Obesidade grau II", calc.CalcularImc(1.80, 114, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoObesidadeGrauIILimiteSuperior() {
		Assert.assertEquals("Obesidade grau II", calc.CalcularImc(1.80, 128, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoObesidadeGrauIIILimiteInferior() {
		Assert.assertEquals("Obesidade grau III", calc.CalcularImc(1.80, 129, 80, "masculino"));
	}
	
	@Test
	public void testeIdosoFemininoBaixoPesoLimiteSuperior() {
		Assert.assertEquals("Baixo peso", calc.CalcularImc(1.80, 70, 80, "Feminino"));
	}
	
	@Test
	public void testeIdosoFemininoPesoNormalLimiteInferior() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(1.80, 71, 80, "Feminino"));
	}
	
	@Test
	public void testeIdosoFemininoPesoNormalLimiteSuperior() {
		Assert.assertEquals("Peso normal", calc.CalcularImc(1.80, 87, 80, "Feminino"));
	}
	
	@Test
	public void testeIdosoFemininoSobrepesoLimiteInferior() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(1.80, 88, 80, "Feminino"));
	}
	
	@Test
	public void testeIdosoFemininoSobrepesoLimiteSuperior() {
		Assert.assertEquals("Sobrepeso", calc.CalcularImc(1.80, 103, 80, "Feminino"));
	}
	
	@Test
	public void testeIdosoFemininoObesidadeGrauILimiteInferior() {
		Assert.assertEquals("Obesidade grau I", calc.CalcularImc(1.80, 104, 80, "Feminino"));
	}
	
	@Test
	public void testeIdosoFemininoObesidadeGrauILimiteSuperior() {
		Assert.assertEquals("Obesidade grau I", calc.CalcularImc(1.80, 119, 80, "Feminino"));
	}
	
	@Test
	public void testeIdosoFemininoObesidadeGrauIILimiteInferior() {
		Assert.assertEquals("Obesidade grau II", calc.CalcularImc(1.80, 120, 80, "Feminino"));
	}
	
	@Test
	public void testeIdosoFemininoObesidadeGrauIILimiteSuperior() {
		Assert.assertEquals("Obesidade grau II", calc.CalcularImc(1.80, 135, 80, "Feminino"));
	}
	
	@Test
	public void testeIdosoFemininoObesidadeGrauIIILimiteInferior() {
		Assert.assertEquals("Obesidade grau III", calc.CalcularImc(1.80, 137, 80, "Feminino"));
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
