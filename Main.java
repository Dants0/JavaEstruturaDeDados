class Main {
  public static void main(String[] args) {
    PilhaTela minhasTelas = new PilhaTela();

    minhasTelas.empilhar(4);
    minhasTelas.empilhar(3);
    minhasTelas.empilhar(2);
    minhasTelas.empilhar(1);

    System.out.println(minhasTelas.peek());
    System.out.println(minhasTelas.desempilhar());
    System.out.println(minhasTelas.peek());
  }
}