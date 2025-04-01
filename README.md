Descrição
Este projeto implementa um sistema para cálculo de valores de peças automotivas (motor, óleo de motor e pneus) com base em diferentes modelos de veículos (Moto, Ônibus, Van e Uno). O sistema aplica percentuais de aumento específicos para cada modelo no cálculo do valor final das peças.

Estrutura do Projeto
Classes Principais
Modelos (Interface)

Define o contrato percentualAumento() que deve ser implementado por cada modelo de veículo

Modelos Implementados:

Moto: 200% de aumento

Onibus: 40% de aumento

Van: 20% de aumento

Uno: 0% de aumento

Peças (Classe Abstrata)

Classe base para todas as peças

Atributos:

modelos: Modelo do veículo

valorBase: Valor base da peça

Métodos abstratos:

calcularValor(): Calcula o valor final da peça

Peças Implementadas:

Motor: Aplica o percentual do modelo ao valor base

OleoMotor: Mantém o valor base sem alterações

Pneus: Calcula com base no valor base × quantidade + percentual do modelo

Testes Unitários
MotorTest: Testes para cálculo de valor do motor com diferentes modelos

OleoMotorTest: Testes para verificar comportamento do óleo de motor

PneuTest: Testes para cálculo de valor de pneus com diferentes quantidades

Como Usar
Instancie a peça desejada com seu valor base:

java
Copy
Motor motor = new Motor(1000.0f);
Defina o modelo do veículo:

java
Copy
motor.setModelos(new Moto());
Calcule o valor final:

java
Copy
float valorFinal = motor.calcularValor();
Exemplo de Uso
java
Copy
// Criando um motor para moto
Motor motorMoto = new Motor(1000.0f);
motorMoto.setModelos(new Moto());
System.out.println("Valor do motor para moto: " + motorMoto.calcularValor());

// Criando pneus para van
Pneus pneusVan = new Pneus(200.0f);
pneusVan.setModelos(new Van());
pneusVan.setQuantidade(4);
System.out.println("Valor dos pneus para van: " + pneusVan.calcularValor());
Requisitos
Java 8 ou superior

JUnit para execução dos testes

Executando os Testes
Os testes podem ser executados com sua ferramenta de build preferida (Maven, Gradle) ou diretamente pela IDE.

Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

