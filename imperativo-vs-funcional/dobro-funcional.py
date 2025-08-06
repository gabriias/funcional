# ao contrário do exemplo imperativo, não há alteração de variável
# a função recebe o valor e retorna o resultado, como uma caixa preta
def dobrar(x):
    return x * 2

numbers = [1, 2, 3, 4]
# aqui já podemos ver o uso de funções encadeadas
# o Map vai aplicar nossa função Dobrar para cada elemento da nossa lista
# e a função List vai receber elementos e transformar numa lista
doubled = list(map(dobrar, numbers))

print(doubled)
