# Fonte: http://www.aizac.info/a-solution-to-the-diamond-problem-in-python/

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