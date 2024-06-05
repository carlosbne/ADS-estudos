""" 
# 1) 
x = 1 + 2 + 3;
print(x);

# 2)
y = 10 + 5 * 2;
print(y);

# 3) 
z = 10 + 100 % 8;
print(z);

# 4) 
a = 10 + 100 / 8;
print(a);

# 5) 
b = 10 + 100 // 8;
print(b);

# 6) 
x = 10;
y = 20;
w = x + y;
x = w + 1.0;
y = x / 2;
z = x // 2;

print(w);
print(x);
print(y);
print(z);

# 7)
mediaA = (7+9.5) / 2;
print(mediaA);


# 8)
x= 0.1;
x= x + 0.1;
x= x + 0.1;
x= x + 0.1;
x= x + 0.1;
x= x + 0.1;
x= x + 0.1;
x= x + 0.1;
x= x + 0.1;
x= x + 0.1;
print(x)
"""

# 9)
""" x = 49 * 1 / 49;
print(x);

y = 1 / 49 * 49;
print(y); 

resultado1 = 49 * 1 / 49
resultado2 = 1 / 49 * 49

print(resultado1)
print(resultado2)
"""
numero = int(input())

c = (numero // 10) 
x = numero % 10
d = (c // 10)
y = d % 10
u = d // 10
z = u % 10

""" print(f'c= {c}, d= {d}, u= {u}') """
print(f'c= {x}, d= {y}, u= {z}')

soma = c+d+u

print(soma)