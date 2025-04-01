public class Pneus extends Pecas {

        private int quantidade;

        public Pneus(float valorBase) {
            super(valorBase);
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public float calcularValor() {
            return this.valorBase * this.quantidade * (1 + this.modelos.percentualAumento());
        }
    }

