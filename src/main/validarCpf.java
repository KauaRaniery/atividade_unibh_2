public class validarCpf {
  private String cpf;

  public ValidaCPF(String cpf) {
    this.cpf = cpf;
  }
public boolean isValido() {
    if (cpf.length() != 11) {
        return false;
    }
    cpf = cpf.replaceAll("[^0-9]", "");
    int primeiroDV = calculeDigitoVerificador(10);
    if (primeiroDV != Character.getNumericValue(cpf.charAt(9))) {
        return false;
    }
    cpf = cpf.substring(0, 9) + primeiroDV;
    int segundoDV = calculeDigitoVerificador(11);
    return segundoDV == Character.getNumericValue(cpf.charAt(10));
}

private int calculeDigitoVerificador(int fator) {      
    int soma = 0;
    for (int i = 0; i < cpf.length(); i++) {
        int digito = Character.getNumericValue(cpf.charAt(i));
        soma += (fator - i) * digito;
    }
    soma = soma % 11;
    if (soma < 2) {
        soma = 0;
    } else {
        soma = 11 - soma;
    }
    return soma;
  }
}