💱 Challenge Java - Conversor de Moedas 💰
Oi! Este é o meu projeto de conversor de moedas, que fiz para praticar Java! Ele converte o valor de uma moeda para outra usando uma API da internet. Foi um desafio e tanto, mas consegui!

❤️ Funcionalidades
Conversão de Moeda: Converte um valor de uma moeda (como Real) para outra (como Dólar).

Busca em Tempo Real: Pega o valor atual das moedas direto da internet.

Interface no Terminal: Roda direto no prompt de comando, simples e direto.

🛠️ Ferramentas que Usei
Java: A linguagem que estou aprendendo.

Gson: Uma biblioteca para entender o JSON que a API manda. (Foi a primeira vez que usei!)

API de Cotações: Usei a ExchangeRate-API porque tem um plano gratuito legal para estudantes.

⚙️ Antes de Rodar
Pra rodar na sua máquina, você vai precisar:

Ter o Java JDK 17 (ou uma versão mais nova) instalado.

Ter uma chave de API (API Key) gratuita do site ExchangeRate-API. É de graça e só precisa fazer um cadastro rápido.

🚀 Como Fazer Funcionar
Baixa o Projeto:

bash
git clone https://github.com/seu-usuario/challenge-java-conversor-moedas.git
cd challenge-java-conversor-moedas
Coloca sua Chave de API:

Abre o arquivo Config.java (ou onde tiver a variável API_KEY).

Troca o texto "SUA_CHAVE_AQUI" pela chave que você pegou no site.

java
public class Config {
    public static final String API_KEY = "coloca_sua_chave_super_secreta_aqui";
}
Hora de Rodar!

Se estiver usando uma IDE (como Eclipse ou IntelliJ), é só clicar em "Run" na classe Main.java.

Se for usar o terminal, compila e executa assim (não esquece de baixar o arquivo gson-2.10.1.jar e colar na pasta do projeto!):

No Linux/macOS:

bash
javac -cp .:gson-2.10.1.jar *.java
java -cp .:gson-2.10.1.jar Main
No Windows:

bash
javac -cp .;gson-2.10.1.jar *.java
java -cp .;gson-2.10.1.jar Main
🎮 Como Usar
É super fácil! O programa vai te fazer umas perguntinhas:

Ele vai pedir a moeda de origem (digita o código, tipo BRL para Real).

Depois, a moeda de destino (tipo USD para Dólar).

Por fim, o valor que você quer converter.

Exemplo de como fica:

text
=== Conversor de Moedas ===

Digite a moeda de origem (ex: BRL): BRL
Digite a moeda de destino (ex: USD): USD
Digite o valor para converter: 50

--> 50.0 BRL equivale a 9.92 USD!
📁 O que Tem Dentro?
A estrutura do projeto é mais ou menos essa aqui (bem simples):

text
src/
├── Main.java              (Aqui onde tudo começa!)
├── Conversor.java         (A classe que faz a mágica da conversão)
├── ApiClient.java         (A classe que "conversa" com a internet)
└── Config.java            (Guarda a chave da API)
lib/
└── gson-2.10.1.jar        (O jar do Gson, importante!)
README.md                  (Este arquivo aqui!)
🚧 Coisas que Quero Melhorar Depois
Fazer uma interface gráfica bonitinha.

Adicionar mais opções, como converter para várias moedas de uma vez.

Salvar o histórico de conversões em um arquivinho de texto.

Tratar os erros melhor, pra não travar se digitar algo errado.

😊 Sobre Mim
Sou um estudante universitário aprendendo Java e este foi um dos meus primeiros projetos conectando com uma API de verdade! Foi desafiador, mas muito gratificante ver funcionando.

Qualquer dica ou sugestão é super bem-vinda!
