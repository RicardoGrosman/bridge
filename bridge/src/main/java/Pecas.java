public abstract class Pecas {

        protected Modelos modelos;

        protected float valorBase;

        public Pecas(float valorbase) {
            this.valorBase = valorbase;
        }

        public void setModelos(Modelos modelos) {
            this.modelos = modelos;
        }

        public void setValorbase(float valorbase) {
            this.valorBase = valorbase;
        }

        public abstract float calcularValor();
    }

