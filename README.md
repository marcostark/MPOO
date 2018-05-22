# MPOO
Códigos da disciplina de Modelagem e Programação Orientada a Objetos

### Site da disciplina: 
	http://sites.google.com/site/profricodemery/mpoo

### Data das avaliações: 
    VA 1 - 18/06 
    VA 2 - 13/08
    VA 3 - 
    VA 4 -

### QUESTIONAMENTO 1: Como garantir a interoperabilidade de sistemas através da semântica de definições Orientada a Objetos. Ex.: Book equivale a Book.

Para o Institute of Electrical and Electronics Engineers (IEEE) a interoperabilidade é a capacidade de um sistema ou produto, de funcionar com outros sistemas ou produtos, sem nenhum tipo de esforço especial por parte de um cliente. Segundo o instituto, a interoperabilidade é possível apenas a partir da aplicação de normas e do uso de padrões. Nesse sentido, a interoperabilidade está atrelada a cooperação, normalizada por especificações, políticas e padrões que viabilizem o intercâmbio integrado de informações.

Um das soluções seria o uso de Webservices, uma vez que é uma das tecnologias mais empregadas para esse fim (Integração de aplicações). O foco é a interoperabilidade, pois possibilitam que programas possam interagirem entre si, especialmente se estes foram desenvolvidos por diferentes plataformas. Uma das vantagens é não precisarem de grandes alterações aos sistemas envolvidos no processo.
	P.S.: O XMl e o JSON são alguns dos padrões escolhidos como base para os protocolos de comunicaçõ de web services.

### QUESTIONAMENTO 2: Porque o main no java é do tipo Static ? E C,pq não ?
- É o ponto de entrada da aplicação, ou seja é o primeiro metodo procurado pela JVM para iniciar a aplicação, por isso o mesmo tem que ser publico para que a JVM possa chama-lo e Static para ser preciso acessa-lo atravez de um instancia.

- Em c não pode ser usado o static, porque Como a função estática em C é visível apenas no mesmo arquivo,  
logo a mesma não poderia ser encontrada pelo vinculador (SO) e usada como ponto de partida do programa.

### QUESTIONAMENTO 3: Verificar area de memoria alocada de uma variavel. Usar C. 
	#include <stdio.h>
	int main(void)
	
	{
	    char caractere;
	    int inteiro;
	    float Float;
	    double Double;
	
	    printf("Caractere: %d bytes \t em %d\n", sizeof(caractere), &caractere);
	    printf("Inteiro: %d bytes \t em %d\n", sizeof(inteiro), &inteiro);
	    printf("Float: %d bytes \t em %d\n", sizeof(Float), &Float);
	    printf("Double: %d bytes \t em %d\n", sizeof(Double), &Double);
	    return 0;
	
	}
	
	SAIDA:
	Caractere: 1 bytes 	em 1046482631
	Inteiro: 4 bytes 	 	em 1046482632
	Float: 4 bytes 	 	em 1046482636
	Double: 8 bytes 	 	em 1046482640

Se forem declaradas variaveis do mesmo tipo, elas ocuparão endereços de memorias continuos. Ou seja
uma após a outra, variando no seu tamanho em bytes


### QUESTIONAMENTO 4: Quando debugado apareceu hash em um atributo, o que é "hash"

"Hashcodes são valores int utilizados para armazenamento e recuperação de alta velocidade 	das informações mantidas em uma estrutura de dados que é conhecida como tabela de hash (veja a Seção 16.11). Esse método também é chamado como parte da implementação padrão do método toString de Object."  DEITEL

Em resumo, gerar um hash é como gerar um ID numérico para o objeto. O número gerado por uma função hash pode ser usado para localizar facilmente um objeto numa espécie de "tabela".
Internamente, no Java por exemplo, essa tabela é um vetor. A cada posição do vetor é atribuído uma faixa de números. Seria como slots de uma prateleira.

### PROBLEMATICA 2: 
	https://github.com/marcostark/MPOO/tree/master/src/primeirava/exercicios/exe2

### QUESTIONAMENTO 5: O garbage coletor do java é usado por quem ?
"A JVM executa coleta de lixo automática para recuperar a memória ocupada por objetos que não são mais usados. Quando não há mais referências a um objeto, o objeto é marcado para coleta de lixo. A coleta normalmente ocorre quando a JVM executa o coletor de lixo, o que pode não acontecer por um tempo, ou até
mesmo absolutamente antes de um programa terminar" - DEITEL

### QUESTIONAMENTO 6: Como as outras linguagens de programação contornam o uso de herança multipla, herdando o mesmo atributo (mesmo nome);

#### Fonte: http://www.aizac.info/a-solution-to-the-diamond-problem-in-python/

	class A():
	    def call(self):
	        pass
	        
	class B1():
	    def call(self):
	        print("Eu sou o parente B1")
	
	class B2():
	    def call(self):
	        print("Eu sou o parente B2")
	
	class B3():
	    def call(self):
	        print("Eu sou o parente B3")
	
	class C():
	    def call(self):
	        print("Eu (C) não sou parente")
	        
	'''
	Classe filha das outras três.
	A ordem importa, da direita para a esquerda, sobrepondo o metodo
	das outras classes tbm herdadas
	Atributos e metodos diferentes se mesclam
	na classe filha.
	'''
	class ME(B2, B1, B3):
	    def wichCall(self):
	        print(self.call())

    def restructure(self, p1, p2, p3):
        '''
    	Em python é possivél reestrutar a ordem
    	das classes em tempo de execução,
    	para usar os metodos corretos que se deseja
        '''
        self.__class__.__bases__ = (p1,p2,p3,)
        
        
    def printBaseClasses(self):
        '''
        Imiprimindo a ordenação das classes.
	    P.S: A ordem das classes define qual metodo usar
	    '''
        print(self.__class__.__bases__)
	
	me = ME()

	# Reestruturando ordem das classes
	#me.restructure(B1, B3, B2)
	
	me.printBaseClasses()
	me.wichCall()

### QUESTIONAMENTO 7: Como obrigar as especializações a implementarem os metodos. Animal anda, mas em pé ou de quatro patas
Uma das implementações possivéis é por meio de métodos abstratos, onde as classes filhas(Concretas) serão obrigadas a implementar tais métodos.

### EXERICIO 4: MAPA mental sobre o que foi visto nas aulas passadas

### EXERICIO 5: Aula 16: Separar a classe ButtonHundler em outro arquivo

### EXERICIO 6: Modelar Corpo Humano usando agregação

### EXERICIO 7: Refazer o removoção de usuario usando outros metodos

### EXERICIO 8: Implementar o metodo toString na classe abstrata usuario, e implementar também em suas especializações, porém, com suas particularidades

### EXERICIO 9: Buscar usuarios usando o metodo .contains

### EXERICIO 10: Criar tela abstrata (Login) e suas especializações implementarão adicionarão os elementos na tela. Na  tela de cadastro será preciso informar o sexo do usuario (Implementar atributo "sexo" na classe usuario)
		


 
