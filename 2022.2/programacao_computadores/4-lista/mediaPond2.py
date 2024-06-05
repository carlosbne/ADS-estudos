a1, a2 = map(int, input().split())
b1, b2 = map(int, input().split())
p1, p2 = map(int, input().split())

mediaPond1 = (a1 * p1) + (a2 * p2) // (p1+p2)
mediaPond2 = (b1 * p2) + (b2 * p2) // (p1+p2)

if (mediaPond1 <= mediaPond2):
    print(1)
else:
    print(2)