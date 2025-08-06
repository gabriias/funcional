numbers = [1, 2, 3, 4]
doubled = []
# temos uma lista vazia

# a lista vai sofrer alterações (mutabilidade)
for n in numbers:
    print(f"lista antes: {doubled}")
    doubled.append(n * 2)
    print(f"lista depois: {doubled}")

print(doubled)
