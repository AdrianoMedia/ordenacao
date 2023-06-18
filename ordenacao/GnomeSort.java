//Adriano, Arthur e Gabriel Santos

package ordenacao;

public class GnomeSort<T extends Comparable<T>> implements Sort<T> {

    @Override
    public void sort(T[] vetor) {
       int tamanho = vetor.length;
       int i = 0;

       while (i < tamanho) {
            if (i == 0 || vetor[i].compareTo(vetor[i - 1]) >= 0) {
                i++;
            } else {
                troca(vetor, i, i - 1);
                i--;
            }
       }
    }

    private void troca(T[] vetor, int i, int j) {
        T info = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = info;
    }
    
}
