import java.util.Scanner;
import class.trabalhador; 
public class Main {
  public static void main(String[] args) {
    Trabalhador trabalhador = new Trabalhador();

    trabalhador.setNome("João");
    trabalhador.setSalarioBruto(1000.0);
    trabalhador.setDescontoINSS(100.0);
    trabalhador.setDeducoesIRRF(150.0);
    trabalhador.setCpf("3385851831");
    trabalhador.setCep("30664650");
    trabalhador.setEnderecoCompleto("Rua A, nº 1");
    trabalhador.calcularSalarioLiquido();
  

    System.out.println("Nome: " + trabalhador.getNome());
    System.out.println("Salário Bruto: " + trabalhador.getSalarioBruto());
    System.out.println("Desconto INSS: " + trabalhador.getDescontoINSS());
    System.out.println("Deduções IRRF: " + trabalhador.getDeducoes());
    System.out.println("CPF: " + trabalhador.getCpf());
    System.out.println("CEP: " + trabalhador.getCep());
    System.out.println("Endereço Completo: " + trabalhador.getEnderecoCompleto());
    System.out.println("Salário Líquido: " + trabalhador.calcularSalario());
    
                       

  }
}