public class Motor extends Pecas {

        public Motor(float valorBase) {
            super(valorBase);
        }

        public float calcularValor() {
            return this.valorBase * (1 + this.modelos.percentualAumento());
        }

    }
