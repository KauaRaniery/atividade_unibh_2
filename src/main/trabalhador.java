package main;

public class trabalhador{
  private String nome;
  private String cpf;
  private String endereco;
  private double salarioBruto;
  private double descontoINSS;
  private double IRRF;

  public Trabalhador(String nome, double salarioBruto, double descontoINSS, double deducoesIRRF, String cpf, String cep){

    this.nome = nome;
    this.salarioBruto = salarioBruto;
    this.descontoINSS = descontoINSS;
    this.deducoesIRRF = deducoesIRRF;
    this.cpf = cpf;
    this.cep = cep;

  }
  public String getNome(){
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public double getSalarioBruto() {
    return salarioBruto;
  }

  public void setSalarioBruto(double salarioBruto) {
    this.salarioBruto = salarioBruto;
  }

  public double getDescontoINSS() {
    return descontoINSS;
  }

  public void setDescontoINSS(double descontoINSS) {
    this.descontoINSS = descontoINSS;
  }

  public double getDeducoesIRRF() {
    return deducoesIRRF;
  }

  public void setDeducoesIRRF(double deducoesIRRF) {
    this.deducoesIRRF = deducoesIRRF;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getEnderecoCompleto() {
    return enderecoCompleto;
  }

  public void setEnderecoCompleto(String enderecoCompleto) {
    this.enderecoCompleto = enderecoCompleto;
  }
   public double calcularImpostoRenda() {
     return 0.0;
  }
  public double calcularSalarioLiquido() {
      double salarioBase = salarioBruto - descontoINSS;
      double baseCalculoIRRF = salarioBase - deducoesIRRF;
      double impostoRenda = calcularImpostoRenda();
      return salarioBase - impostoRenda;
  }
}