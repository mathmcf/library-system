# Sistema de Biblioteca
Conceitos de Programação Orientada a Objetos através de um Sistema de Biblioteca.

## 📝 Resumo

Este pequeno projeto foi desenvolvido com o objetivo de apresentar a utilização dos pilares da Programação Orientada a Objetos: Herança, Encapsulamento, Polimorfismo e Abstração, como parte do desafio do Bootcamp: Backend com Java e AWS, organizado pela empresa CI&T, em parceria com a plataforma digital de educação: DIO (Digital Inovation One). 

O projeto consiste nas seguintes Classes que compõem um Sistema de Biblioteca, nomeadas em Inglês:

* [Book](https://github.com/mathmcf/library-system/blob/main/src/com/br/system/model/Book.java);
* [Magazine](https://github.com/mathmcf/library-system/blob/main/src/com/br/system/model/Magazine.java);
* [Dvd](https://github.com/mathmcf/library-system/blob/main/src/com/br/system/model/Dvd.java);
* [Item](https://github.com/mathmcf/library-system/blob/main/src/com/br/system/model/Item.java);
* [Loan](https://github.com/mathmcf/library-system/blob/main/src/com/br/system/service/Loan.java);
* [Library](https://github.com/mathmcf/library-system/blob/main/src/com/br/system/service/Library.java);
* [User](https://github.com/mathmcf/library-system/blob/main/src/com/br/system/model/User.java);
* [RunLibrary](https://github.com/mathmcf/library-system/blob/main/src/com/br/system/app/RunLibrary.java).

## 🛠️ Requisitos de Sistema

Para compilar e executar este projeto, será necessário instalar as seguintes ferramentas:

* **Java Development Kit (JDK):** Versão **17 (LTS)** ou superior.
* **Sistema de Controle de Versão:** Git.

## ⚙️ Instalação e Execução

Siga estes passos simples para rodar o projeto localmente:
  
### 1. Clonar o Repositório

Utilize o comando Git para criar um diretório local de trabalho a partir do repositório remoto:

Exemplo: **git clone** https://github.com/mathmcf/library-system.git

### 2. Compilar o código Java:

Navegue até o diretório *src/com/br/system/app* e compile o arquivo principal.

Exemplo de compilação dentro da raiz do projeto: **javac src/com/br/system/app/RunLibrary.java**.

### 3. Executar o Programa:

Utilize o seguinte comando para executar a Classe *Main* (**RunLibrary**): **java src/com/br/system/app/RunLibrary**.

## 💡 Conceitos de POO Apresentados

### 1. Encapsulamento 

Classes: *Loan*, *Magazine*, *User*, *Library*, *Book*, *Dvd* e *Magazine*  utilizam modificadores de acesso **private** para proteger os dados internos (atributos), enquanto a Classe *Item* possui o modificador
de acesso: **protected** como forma de representar o acesso a seus atributos via Herança pelas Classes: *Book*, *Dvd* e *Magazine*.

Acesso e modificação dos dados apenas através de métodos públicos (getters e setters).

### 2. Herança 

As Classes *Book*, *Dvd* e *Magazine* herdam os métodos e atributos da Superclasse: *Item*, pela palavra-chave: **extends**

### 3. Polimorfismo

Polimorfismo de Sobrescrita (**Override**): Demonstra os métodos e atributos que se comportam de maneira diferente nas Classes Filhas. Exemplo:

As implementações: *book.printItem()*, *dvd.printItem()* e *magazine.printItem()* das Classe: *Book*, *Dvd* e *Magazine*, sobrescrevendo a implementação do método abstrato: *printItem()* da Superclasse *Item*.

### 4. Abstração

É definido como o Sistema de Biblioteca irá funcionar a partir dos seguintes métodos da Classe: *Library* que permitem trabalhar com uma coleção de Itens da biblioteca, por meio do atributo: *"List\<Item> itens"*.

* Adicionar items: *public void addItems(Item item)*;
* Buscar item pelo título: *public String searchItemByTitle(String title)*;
* Imprime todos os itens da lista do tipo Item: *public void printItens()*;
* Solicitar empréstimo: *public void getALoan(User user, Item item)*;
* Verificar empréstimo: *public boolean checkLoan(Item item)*;
* Registrar devolução: *public Item returnAnItem(Item item)*;
* Mostrar todos os itens emprestados: *public Map<Item, User> showAllBorrowedItens()*;
  
## 💻 Tecnologias Utilizadas

* **Java 17** (*OpenJDK 17*);
* **Git**.
