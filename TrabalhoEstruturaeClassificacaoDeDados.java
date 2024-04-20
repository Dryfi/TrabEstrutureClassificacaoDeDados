
package trabalhoestruturaeclassificacaodedados;

import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class TrabalhoEstruturaeClassificacaoDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String tamVetor = JOptionPane.showInputDialog
        ("Digite o tamanho do vetor a ser ordenado:");
        int nrTamanhoVetor = Integer.parseInt(tamVetor);

        int[] vetor = new int[nrTamanhoVetor];
        for (int i = 0; i < vetor.length; i++) {
            String aux = JOptionPane.showInputDialog((i + 1) + "posição");
            vetor[i] = Integer.parseInt(aux);
        }

        boolean opcaoValida = false;
        while (!opcaoValida) {
            String opcaoOrdenacao = JOptionPane.showInputDialog
        ("Escolha um metodo de ordenação dentre os três abaixo citados:  "
                    + "\n1 Ordenação Bolha"
                    + "\n2 Ordenação por Seleção"
                    + "\n3 Ordenação por Inserçao");
            int opcao = Integer.parseInt(opcaoOrdenacao);

            switch (opcao) {
                case 1:
                    opcaoValida = true;
                    OrdenacaoInsercao(vetor);
                    break;
                case 2:
                    opcaoValida = true;
                    OrdenacaoSelecao(vetor);
                    break;
                case 3:
                    opcaoValida = true;
                    OrdenacaoBolha(vetor);
                    break;
                default:
                    JOptionPane.showMessageDialog
        (null, "Opção Inválida!");
                    break;
            }
        }
    }

    

     public static void OrdenacaoBolha(int vetor[]) {

        int[] vetorOrd = vetor.clone();
        boolean houveTroca = true;
        while (houveTroca) {
            houveTroca = false;
            for (int i = 0; i < vetorOrd.length - 1; i++) {
                if (vetorOrd[i] > vetorOrd[i + 1]) {
                    int aux = vetorOrd[i];
                    vetorOrd[i] = vetorOrd[i + 1];
                    vetorOrd[i + 1] = aux;
                    houveTroca = true;
                }

            }
        }

        String msg = "Vetor Digitado: ";
        for (int i = 0; i < vetor.length; i++) {
            msg += vetor[i];
            if (i < vetor.length - 1) {
                msg += " ; ";
            }
        }
        msg += "\nVetor Ordenado: ";
        for (int i = 0; i < vetorOrd.length; i++) {
            msg += vetorOrd[i];
            if (i < vetorOrd.length - 1) {
                msg += " ; ";
            }
        }

        JOptionPane.showMessageDialog
        (null, msg);
    }
    public static void OrdenacaoSelecao(int vetor[]) {

        int[] vetorOrd = vetor.clone();
        for (int i = 0; i < vetorOrd.length; i++) {

            int posicaoMenor = i;
            for (int j = i + 1; j < vetorOrd.length; j++) {

                if (vetorOrd[j] < vetorOrd[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            if (posicaoMenor != i) {
                int aux = vetorOrd[i];
                vetorOrd[i] = vetorOrd[posicaoMenor];
                vetorOrd[posicaoMenor] = aux;
            }
        }

        String msg = "Vetor Digitado: ";
        for (int i = 0; i < vetor.length; i++) {
            msg += vetor[i];
            if (i < vetor.length - 1) {
                msg += " ; ";
            }
        }
        msg += "\nVetor Ordenado: ";
        for (int i = 0; i < vetorOrd.length; i++) {
            msg += vetorOrd[i];
            if (i < vetorOrd.length - 1) {
                msg += " ; ";
            }
        }

        JOptionPane.showMessageDialog
        (null, msg);
    }

    public static void OrdenacaoInsercao(int vetor[]) {

        int[] vetorOrd = vetor.clone();
        int chave;
        int j;

        for (int i = 1; i < vetorOrd.length; i++) {
            chave = vetorOrd[i];
            for (j = i - 1; (j >= 0 && vetorOrd[j] > chave); j--) {
                vetorOrd[j + 1] = vetorOrd[j];
            }
            vetorOrd[j + 1] = chave;
        }

        String msg = "Vetor Digitado: ";
        for (int i = 0; i < vetor.length; i++) {
            msg += vetor[i];
            if (i < vetor.length - 1) {
                msg += " ; ";
            }
        }
        msg += "\nVetor Ordenado: ";
        for (int i = 0; i < vetorOrd.length; i++) {
            msg += vetorOrd[i];
            if (i < vetorOrd.length - 1) {
                msg += " ; ";
            }
        }

        JOptionPane.showMessageDialog
        (null, msg);
    }
    
}
