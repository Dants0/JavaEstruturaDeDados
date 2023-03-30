import java.util.ArrayList;
import java.util.List;

public class PilhaTela {
  List<Integer> pil;

  PilhaTela() {
    pil = new ArrayList<>();
  }

  void empilhar(int value) {
    pil.add(value);
    System.out.println("Valor empilhado: " + value);
  }

  int desempilhar() {
    if (!isEmpty()) {
      int popValue = pil.get(pil.size() - 1);
      pil.remove(pil.size() - 1);
      System.out.println("Valor desempilhado " + popValue);
      return popValue;
    } else {
      System.out.println("A pilha está vazia");
      return -1;
    }
  }

  boolean isEmpty() {
    if (pil.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  int peek() {
    return pil.get(pil.size() - 1);
  }

}
